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

    @Override
    public void beforeGameSave() {
        super.beforeGameSave();
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
        UCLP_Printer.printall();
    }
}