package UnofficalCaptionsLogPrinter.data.scripts;

import CaptainsLog.campaign.intel.CustomMessageIntel;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.comm.IntelInfoPlugin;
import com.fs.starfarer.api.campaign.comm.IntelManagerAPI;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class UCLP_Printer {
    /*
    *   - printing a NEW LOG HERE:
  - Attempting to log a captions log thing:
  - Time of PlayerVisable: -55661256720000
  - My First Log
  - Mar 2, c206 (0 days ago)
  - Location: Corvus star system
  - The Endless Void Of a description because im so funny and cool =)
  - Mar 2, c206 (0 days ago)
  - Location: Corvus star system
  *
  * so thats in order:
  * -1) time of player visable (gotten manually)
  * 1) log name
  * 2) date of log
  * 3) location of log
  * 4) description
  * 5) date of log (again)
  * 6) location of log (again)
  *
  * what i need to find:
  * cords of my position (in star system)
  * cords of my position (in sector)*/
    private static final String path = "";
    private static final String fileName = "out.txt";
    public static void printall(){
        ArrayList<UCLP_Memory> memory = new ArrayList<>();
        IntelManagerAPI manager = Global.getSector().getIntelManager();
        List<IntelInfoPlugin> intell = manager.getIntel(CustomMessageIntel.class);
        if (intell.size() == 0) return;

        for (IntelInfoPlugin a : intell){
            memory.add(new UCLP_Memory(a));
        }
        organizeList(memory);
        String text = "\n";
        for (UCLP_Memory a : memory){
            a.print();
            text+=a.getString();
        }
        final Logger LOG = Global.getLogger(UCLP_Printer.class);
        LOG.info(text);

    }
    /*public static void printallWithPrinter(){
        ArrayList<UCLP_Memory> memory = new ArrayList<>();
        IntelManagerAPI manager = Global.getSector().getIntelManager();
        List<IntelInfoPlugin> intell = manager.getIntel(CustomMessageIntel.class);
        if (intell.size() == 0) return;
        //final Logger LOG = Global.getLogger(UCLP_Printer.class);

        FileWriter FW = null;
        try {
            FW = new FileWriter(fileName);
        }catch (Exception e){

        }
        PrintWriter printer = new PrintWriter(FW);

        for (IntelInfoPlugin a : intell){
            memory.add(new UCLP_Memory(a,printer));
            //LOG.info("printing a NEW LOG HERE:");
            //print(a);
        }
        organizeList(memory);
        for (UCLP_Memory a : memory){
            a.print();
        }
        printer.close();

    }*/
    public static ArrayList<UCLP_Memory> organizeList(ArrayList<UCLP_Memory> memory){
        ArrayList<UCLP_Memory> out = new ArrayList<>();
        for (UCLP_Memory a : memory){
            boolean got = false;
            for (int b = 0; b < out.size(); b++){
                if (out.get(b).timeOFLog > a.timeOFLog){
                    out.add(a);
                }
            }
            if (!got){
                out.add(a);
            }
        }
        return out;
    }
    public static void print(IntelInfoPlugin intell){

        //Constants.CUSTOM_MESSAGE_INTEL_TAG
        UCLP_ToolTipMemory info = new UCLP_ToolTipMemory();//new UCLP_ToolTipMemory();
        //new TooltipMakerAPI.TooltipLocation();
        //title
        intell.createIntelInfo(info,IntelInfoPlugin.ListInfoMode.IN_DESC);
        //main body text.
        intell.createSmallDescription(info,0,0);
        //location
        /*SectorMapAPI map = ????;
        intell.get(0).getMapLocation();*/
        //time
        long time = intell.getPlayerVisibleTimestamp();
        final Logger LOG = Global.getLogger(UCLP_Printer.class);
        LOG.info("Attempting to log a captions log thing: ");
        LOG.info("Time of PlayerVisable: "+time);
        CustomMessageIntel temp = (CustomMessageIntel)intell;
        float[] starXY = new float[2];
        float[] worldXY = new float[2];
        boolean isStar = true;
        boolean isEntity = true;
        if(temp.getEntity().isInHyperspace()) {
            temp.getEntity().getLocationInHyperspace();
        }else{
            try {
                starXY = new float[]{temp.getEntity().getStarSystem().getLocation().getX(), temp.getEntity().getStarSystem().getLocation().getY()};
            } catch (Exception e) {
                isStar = false;
            }
            try {
                worldXY = new float[]{temp.getEntity().getLocation().getX(), temp.getEntity().getLocation().getY()};
            } catch (Exception e) {
                isEntity = false;
            }
        }
        //intell.getMapLocation();
        LOG.info("Time of PlayerVisable: "+time);
        for (String a : info.getItems()){
            LOG.info(a);
        }
    }
}
