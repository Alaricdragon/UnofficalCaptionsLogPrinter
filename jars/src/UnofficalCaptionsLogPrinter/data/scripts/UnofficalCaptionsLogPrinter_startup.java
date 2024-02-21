package UnofficalCaptionsLogPrinter.data.scripts;
import CaptainsLog.Constants;
import CaptainsLog.campaign.intel.CustomMessageControlPanel;
import CaptainsLog.campaign.intel.CustomMessageIntel;
import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.comm.IntelInfoPlugin;
import com.fs.starfarer.api.campaign.comm.IntelManagerAPI;
import com.fs.starfarer.api.ui.CustomPanelAPI;
import com.fs.starfarer.api.ui.SectorMapAPI;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import org.apache.log4j.Logger;

import java.util.List;

public class UnofficalCaptionsLogPrinter_startup extends BaseModPlugin {
    @Override
    public void onApplicationLoad() {
    }

    @Override
    public void onGameLoad(boolean newGame) {
        super.onGameLoad(newGame);
        attemptPrint();
    }
    public void testing(){
        /*ok, so i have started to look though the infermation in the captions log classes, and i have a issue.
         * for one thing, the data related to getting a ressage is mostly private. so i might be foreced to make my own version just for that nonesense.
         * for another thing, i cant find were on earth the data is set in the first place.... frustrating....
         * i have done farther investagation into this mannor. i beleave its a certenty that i will apsolutly have to create a version of my own of captions logs...
         *
         * CustomMessageIntel */


        /**/
        CustomMessageIntel a = null;

        IntelManagerAPI manager = Global.getSector().getIntelManager();
        List<IntelInfoPlugin> intell = manager.getIntel();
        //intell.get(0).getSmallDescriptionTitle();
        //intell.get(0).getMapLocation();
        CustomPanelAPI panel= null;
        intell.get(0).createLargeDescription(panel,0,0);/**/
        TooltipMakerAPI info = null;
        int b;
        intell.get(0).createSmallDescription(info,0,0);
        info.toString();
        //info

    }
    public void attemptPrint(){
        //Constants.CUSTOM_MESSAGE_INTEL_TAG
        IntelManagerAPI manager = Global.getSector().getIntelManager();
        List<IntelInfoPlugin> intell = manager.getIntel(CustomMessageIntel.class);
        UCLP_ToolTipMemory info = new UCLP_ToolTipMemory();//new UCLP_ToolTipMemory();
        if (intell.size() == 0) return;
        //new TooltipMakerAPI.TooltipLocation();
        //title
        intell.get(0).createIntelInfo(info,IntelInfoPlugin.ListInfoMode.IN_DESC);
        //main body text.
        intell.get(0).createSmallDescription(info,0,0);
        //location
        /*SectorMapAPI map = ????;
        intell.get(0).getMapLocation();*/
        //time
        long time = intell.get(0).getPlayerVisibleTimestamp();
        String textTemp = info.toString();
        final Logger LOG = Global.getLogger(this.getClass());
        LOG.info("Attempting to log a captions log thing: ");
        LOG.info("Time of PlayerVisable: "+time);
        for (String a : info.getItems()){
            LOG.info(a);
        }
    }
}