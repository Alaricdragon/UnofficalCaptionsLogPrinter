package UnofficalCaptionsLogPrinter.data.scripts;

import CaptainsLog.campaign.intel.CustomMessageIntel;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.SectorEntityToken;
import com.fs.starfarer.api.campaign.comm.IntelInfoPlugin;
import org.apache.log4j.Logger;

import java.io.PrintWriter;
import java.util.Arrays;

public class UCLP_Memory {

    private static final String HPDescription= Global.getSettings().getString("UCLP_HPDescription");//"Sector Hyperspace Coordinates %s,%s ";
    private static final String ISDescription= Global.getSettings().getString("UCLP_ISDescription");//"System Coordinates %s,%s ";

    private static final String HPDescription2= Global.getSettings().getString("UCLP_HPDescription2");//"unknown";
    private static final String ISDescription2= Global.getSettings().getString("UCLP_ISDescription2");//"unknown";

    private static final String ender = Global.getSettings().getString("UCLP_ender");//"________";

    private PrintWriter printer = null;
    private IntelInfoPlugin intell;
    public double timeOFLog;
    private String date;
    private String logName;
    private String logContents;
    private String location;
    private SectorEntityToken entityToken;
    public UCLP_Memory(IntelInfoPlugin intell){
        //long time = intell.getPlayerVisibleTimestamp();
        UCLP_ToolTipMemory info = new UCLP_ToolTipMemory();//new UCLP_ToolTipMemory();
        //title
        intell.createIntelInfo(info,IntelInfoPlugin.ListInfoMode.IN_DESC);
        //main body text.
        intell.createSmallDescription(info,0,0);
        this.logName = info.items.get(0);
        this.date = info.items.get(1);
        this.location = info.items.get(2);
        this.logContents = info.items.get(3);
        CustomMessageIntel temp = (CustomMessageIntel)intell;
        this.entityToken = temp.getEntity();


        timeOFLog = intell.getPlayerVisibleTimestamp();
        //        this.setDateAsNumber(date);
    }
    public UCLP_Memory(IntelInfoPlugin intell,PrintWriter printer){
        this.printer = printer;
        //long time = intell.getPlayerVisibleTimestamp();
        UCLP_ToolTipMemory info = new UCLP_ToolTipMemory();//new UCLP_ToolTipMemory();
        //title
        intell.createIntelInfo(info,IntelInfoPlugin.ListInfoMode.IN_DESC);
        //main body text.
        intell.createSmallDescription(info,0,0);
        this.logName = info.items.get(0);
        this.date = info.items.get(1);
        this.location = info.items.get(2);
        this.logContents = info.items.get(3);
        CustomMessageIntel temp = (CustomMessageIntel)intell;
        this.entityToken = temp.getEntity();


        timeOFLog = intell.getPlayerVisibleTimestamp();
        //        this.setDateAsNumber(date);
    }
    public void setDateAsNumber(String date){
    }
    public void print(){
        /*float[] starXY = new float[2];
        float[] worldXY = new float[2];
        boolean isStar = true;
        boolean isEntity = true;*/
        String cords = "";
        if(entityToken.isInHyperspace()) {
            try {
                cords += getSplitString(HPDescription,new String[]{""+(int)entityToken.getLocationInHyperspace().getX(),""+(int)entityToken.getLocationInHyperspace().getY()});
            }catch (Exception e){
                cords += getSplitString(HPDescription,new String[]{HPDescription2,""});
            }
        }else{
            try {
                //starXY = new float[]{entityToken.getStarSystem().getLocation().getX(), entityToken.getStarSystem().getLocation().getY()};
                cords += getSplitString(HPDescription,new String[]{""+(int)entityToken.getLocationInHyperspace().getX(),""+(int)entityToken.getLocationInHyperspace().getY()});
            } catch (Exception e) {
                cords += getSplitString(HPDescription,new String[]{HPDescription2,""});
            }
            try {
                //worldXY = new float[]{entityToken.getLocation().getX(), entityToken.getLocation().getY()};
                cords += getSplitString(ISDescription,new String[]{""+(int)entityToken.getLocation().getX(),""+(int)entityToken.getLocation().getY()});
                //printLine(entityToken.getLocation().getX()+","+entityToken.getLocation().getY());
            } catch (Exception e) {
                cords += getSplitString(ISDescription,new String[]{ISDescription2,""});
            }
        }
        //printLine("TIME TEMP"+this.timeOFLog);
        printLine(this.logName);
        printLine(this.location);
        printLine(cords);
        printLine(this.date);
        printLine(this.logContents);
        printLine(ender);
    }
    public String outputString = "";
    public void printLine(String text){
        /*if (printer != null){
            printer.println(text);
            return;
        }*/
        outputString += text+"\n";
        /*final Logger LOG = Global.getLogger(UCLP_Printer.class);
        LOG.info(text);*/
    }
    public String getString(){
        return outputString;
    }
    protected static String getSplitString(String primary,String[] secondary){
        StringBuilder output = new StringBuilder();
        String[] a = primary.split("%s");
        try {
            for (int b = 0; b < a.length - 1; b++) {
                output.append(a[b]).append(secondary[b]);
            }
            output.append(a[a.length - 1]);
        }catch (Exception e){
            return "";
        }
        return output.toString();
    }
}
