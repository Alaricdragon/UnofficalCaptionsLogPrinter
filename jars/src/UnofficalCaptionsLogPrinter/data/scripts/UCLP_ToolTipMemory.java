package UnofficalCaptionsLogPrinter.data.scripts;

import com.fs.starfarer.api.campaign.*;
import com.fs.starfarer.api.campaign.econ.CommodityOnMarketAPI;
import com.fs.starfarer.api.characters.PersonAPI;
import com.fs.starfarer.api.combat.MutableStat;
import com.fs.starfarer.api.combat.StatBonus;
import com.fs.starfarer.api.fleet.FleetMemberAPI;
import com.fs.starfarer.api.impl.campaign.intel.events.BaseEventIntel;
import com.fs.starfarer.api.input.InputEventAPI;
import com.fs.starfarer.api.ui.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UCLP_ToolTipMemory implements TooltipMakerAPI {
    protected ArrayList<String> items = new ArrayList<String>();
    public void CleanMemory(){
        items = new ArrayList<String>();
    }
    private void addItem(String item){
        items.add(item);
    }
    public ArrayList<String> getItems(){
        return items;
    }
    @Override
    public UIComponentAPI addSkillPanelOneColumn(com.fs.starfarer.api.characters.PersonAPI a,boolean b,float c){
        return null;
    }
    @Override
    public UIComponentAPI addSkillPanel(com.fs.starfarer.api.characters.PersonAPI a,boolean b,float c){
        return null;
    }
    @Override
    public LabelAPI addTitle(String text) {
        return null;
    }

    @Override
    public void setTitleFont(String titleFont) {

    }

    @Override
    public void setTitleSmallOrbitron() {

    }

    @Override
    public void setTitleFontColor(Color titleFontColor) {

    }

    @Override
    public void setParaFont(String paraFont) {

    }

    @Override
    public void setParaFontColor(Color paraFontColor) {

    }

    @Override
    public void setParaSmallInsignia() {

    }

    @Override
    public LabelAPI addPara(String format, float pad, Color hl, String... highlights) {
        addItem(format);
        return null;
    }

    @Override
    public LabelAPI addPara(String str, float pad) {
        addItem(str);
        return null;
    }

    @Override
    public LabelAPI addPara(String str, Color color, float pad) {
        addItem(str);
        return null;
    }

    @Override
    public LabelAPI addSectionHeading(String str, Alignment align, float pad) {
        return null;
    }

    @Override
    public LabelAPI addSectionHeading(String str, Color textColor, Color bgColor, Alignment align, float pad) {
        return null;
    }

    @Override
    public void beginGrid(float itemWidth, int cols) {

    }

    @Override
    public void beginGrid(float itemWidth, int cols, Color labelColor) {

    }

    @Override
    public Object addToGrid(int x, int y, String label, String value) {
        return null;
    }

    @Override
    public Object addToGrid(int x, int y, String label, String value, Color valueColor) {
        return null;
    }

    @Override
    public void setGridLabelColor(Color nameColor) {

    }

    @Override
    public void addGrid(float pad) {

    }

    @Override
    public void beginGridFlipped(float itemWidth, int cols, float valueWidth, float valuePad) {

    }

    @Override
    public void beginGridFlipped(float itemWidth, int cols, Color labelColor, float valueWidth, float valuePad) {

    }

    @Override
    public void addStatModGrid(float width, float valueWidth, float valuePad, float pad, MutableStat stat) {

    }

    @Override
    public void addStatModGrid(float width, float valueWidth, float valuePad, float pad, StatBonus stat) {

    }

    @Override
    public void addStatGridForShips(float width, float valueWidth, float valuePad, float pad, CampaignFleetAPI fleet, int maxNum, boolean ascending, FleetMemberValueGetter getter) {

    }

    @Override
    public void setGridFontDefault() {

    }

    @Override
    public void setGridFont(String gridFont) {

    }

    @Override
    public void addStatModGrid(float width, float valueWidth, float valuePad, float pad, MutableStat stat, StatModValueGetter getter) {

    }

    @Override
    public void addStatModGrid(float width, float valueWidth, float valuePad, float pad, StatBonus stat, StatModValueGetter getter) {

    }

    @Override
    public void setParaSmallOrbitron() {

    }

    @Override
    public LabelAPI addTitle(String text, Color color) {
        return null;
    }

    @Override
    public void setParaFontVictor14() {

    }

    @Override
    public void addImage(String spriteName, float pad) {

    }

    @Override
    public void addImage(String spriteName, float width, float pad) {

    }

    @Override
    public void setParaFontDefault() {

    }

    @Override
    public void setParaOrbitronLarge() {

    }

    @Override
    public void setParaOrbitronVeryLarge() {

    }

    @Override
    public void setParaInsigniaLarge() {

    }

    @Override
    public void setParaInsigniaVeryLarge() {

    }

    @Override
    public void setTitleOrbitronLarge() {

    }

    @Override
    public void setTitleOrbitronVeryLarge() {

    }

    @Override
    public void beginIconGroup() {

    }

    @Override
    public void setIconSpacingMedium() {

    }

    @Override
    public void setIconSpacingWide() {

    }

    @Override
    public void addIcons(CommodityOnMarketAPI com, int num, IconRenderMode mode) {

    }

    @Override
    public void addIconGroup(float pad) {

    }

    @Override
    public void addIconGroup(float rowHeight, float pad) {

    }

    @Override
    public void cancelGrid() {

    }

    @Override
    public void addIconGroupAndCenter(float pad) {

    }

    @Override
    public void addStatModGrid(float width, float valueWidth, float valuePad, float pad, StatBonus stat, boolean showNonMods, StatModValueGetter getter) {

    }

    @Override
    public void showCargo(CargoAPI cargo, int max, boolean sort, float pad) {

    }

    @Override
    public void showShips(List<FleetMemberAPI> ships, int max, boolean sort, float pad) {

    }

    @Override
    public UIPanelAPI beginTable(FactionAPI faction, float itemHeight, Object... columns) {
        return null;
    }

    @Override
    public UIPanelAPI beginTable2(FactionAPI faction, float itemHeight, boolean withBorder, boolean withHeader, Object... columns) {
        return null;
    }

    @Override
    public UIPanelAPI beginTable(Color base, Color dark, Color bright, float itemHeight, Object... columns) {
        return null;
    }

    @Override
    public UIPanelAPI beginTable(Color base, Color dark, Color bright, float itemHeight, boolean withBorder, boolean withHeader, Object... columns) {
        return null;
    }

    @Override
    public Object addRow(Object... data) {
        return null;
    }

    @Override
    public Object addRowWithGlow(Object... data) {
        return null;
    }

    @Override
    public void addTooltipToAddedRow(TooltipCreator tc, TooltipLocation loc) {

    }

    @Override
    public void addTooltipToAddedRow(TooltipCreator tc, TooltipLocation loc, boolean recreateEveryFrame) {

    }

    @Override
    public void addTable(String emptyText, int andMore, float pad) {

    }

    @Override
    public void setGridValueColor(Color valueColor) {

    }

    @Override
    public TooltipMakerAPI beginImageWithText(String spriteName, float imageHeight) {
        return null;
    }

    @Override
    public UIPanelAPI addImageWithText(float pad) {
        return null;
    }

    @Override
    public void addIconGroup(float rowHeight, int rows, float pad) {

    }

    @Override
    public LabelAPI addPara(String format, float pad, Color color, Color hl, String... highlights) {
        return null;
    }

    @Override
    public void setButtonFontDefault() {

    }

    @Override
    public void setButtonFontVictor10() {

    }

    @Override
    public void setButtonFontVictor14() {

    }

    @Override
    public ButtonAPI addButton(String text, Object data, float width, float height, float pad) {
        return new ButtonAPI() {
            @Override
            public void setShortcut(int key, boolean putLast) {

            }

            @Override
            public void setEnabled(boolean enabled) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void setButtonPressedSound(String buttonPressedSound) {

            }

            @Override
            public void setMouseOverSound(String mouseOverSound) {

            }

            @Override
            public void setButtonDisabledPressedSound(String buttonDisabledPressedSound) {

            }

            @Override
            public boolean isChecked() {
                return false;
            }

            @Override
            public void setChecked(boolean checked) {

            }

            @Override
            public void highlight() {

            }

            @Override
            public void unhighlight() {

            }

            @Override
            public boolean isHighlighted() {
                return false;
            }

            @Override
            public void setHighlightBrightness(float highlightBrightness) {

            }

            @Override
            public float getHighlightBrightness() {
                return 0;
            }

            @Override
            public void setQuickMode(boolean quickMode) {

            }

            @Override
            public void setClickable(boolean clickable) {

            }

            @Override
            public float getGlowBrightness() {
                return 0;
            }

            @Override
            public void setGlowBrightness(float glowBrightness) {

            }

            @Override
            public void setText(String text) {

            }

            @Override
            public String getText() {
                return null;
            }

            @Override
            public void setSkipPlayingPressedSoundOnce(boolean skipPlayingPressedSoundOnce) {

            }

            @Override
            public void setHighlightBounceDown(boolean b) {

            }

            @Override
            public void setShowTooltipWhileInactive(boolean showTooltipWhileInactive) {

            }

            @Override
            public void setRightClicksOkWhenDisabled(boolean rightClicksOkWhenDisabled) {

            }

            @Override
            public void setFlashBrightness(float flashBrightness) {

            }

            @Override
            public void flash(boolean withSound, float in, float out) {

            }

            @Override
            public void flash(boolean withSound) {

            }

            @Override
            public void flash() {

            }

            @Override
            public void setPerformActionWhenDisabled(boolean performActionWhenDisabled) {

            }

            @Override
            public boolean isPerformActionWhenDisabled() {
                return false;
            }

            @Override
            public boolean isSkipPlayingPressedSoundOnce() {
                return false;
            }

            @Override
            public Object getCustomData() {
                return null;
            }

            @Override
            public void setCustomData(Object customData) {

            }

            @Override
            public PositionAPI getPosition() {
                return null;
            }

            @Override
            public void render(float alphaMult) {

            }

            @Override
            public void processInput(List<InputEventAPI> events) {

            }

            @Override
            public void advance(float amount) {

            }
        };
    }

    @Override
    public ButtonAPI addButton(String text, Object data, Color base, Color bg, float width, float height, float pad) {
        return new ButtonAPI() {
            @Override
            public void setShortcut(int key, boolean putLast) {

            }

            @Override
            public void setEnabled(boolean enabled) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void setButtonPressedSound(String buttonPressedSound) {

            }

            @Override
            public void setMouseOverSound(String mouseOverSound) {

            }

            @Override
            public void setButtonDisabledPressedSound(String buttonDisabledPressedSound) {

            }

            @Override
            public boolean isChecked() {
                return false;
            }

            @Override
            public void setChecked(boolean checked) {

            }

            @Override
            public void highlight() {

            }

            @Override
            public void unhighlight() {

            }

            @Override
            public boolean isHighlighted() {
                return false;
            }

            @Override
            public void setHighlightBrightness(float highlightBrightness) {

            }

            @Override
            public float getHighlightBrightness() {
                return 0;
            }

            @Override
            public void setQuickMode(boolean quickMode) {

            }

            @Override
            public void setClickable(boolean clickable) {

            }

            @Override
            public float getGlowBrightness() {
                return 0;
            }

            @Override
            public void setGlowBrightness(float glowBrightness) {

            }

            @Override
            public void setText(String text) {

            }

            @Override
            public String getText() {
                return null;
            }

            @Override
            public void setSkipPlayingPressedSoundOnce(boolean skipPlayingPressedSoundOnce) {

            }

            @Override
            public void setHighlightBounceDown(boolean b) {

            }

            @Override
            public void setShowTooltipWhileInactive(boolean showTooltipWhileInactive) {

            }

            @Override
            public void setRightClicksOkWhenDisabled(boolean rightClicksOkWhenDisabled) {

            }

            @Override
            public void setFlashBrightness(float flashBrightness) {

            }

            @Override
            public void flash(boolean withSound, float in, float out) {

            }

            @Override
            public void flash(boolean withSound) {

            }

            @Override
            public void flash() {

            }

            @Override
            public void setPerformActionWhenDisabled(boolean performActionWhenDisabled) {

            }

            @Override
            public boolean isPerformActionWhenDisabled() {
                return false;
            }

            @Override
            public boolean isSkipPlayingPressedSoundOnce() {
                return false;
            }

            @Override
            public Object getCustomData() {
                return null;
            }

            @Override
            public void setCustomData(Object customData) {

            }

            @Override
            public PositionAPI getPosition() {
                return null;
            }

            @Override
            public void render(float alphaMult) {

            }

            @Override
            public void processInput(List<InputEventAPI> events) {

            }

            @Override
            public void advance(float amount) {

            }
        };
    }

    @Override
    public ButtonAPI addButton(String text, Object data, Color base, Color bg, Alignment align, CutStyle style, float width, float height, float pad) {
        return new ButtonAPI() {
            @Override
            public void setShortcut(int key, boolean putLast) {

            }

            @Override
            public void setEnabled(boolean enabled) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void setButtonPressedSound(String buttonPressedSound) {

            }

            @Override
            public void setMouseOverSound(String mouseOverSound) {

            }

            @Override
            public void setButtonDisabledPressedSound(String buttonDisabledPressedSound) {

            }

            @Override
            public boolean isChecked() {
                return false;
            }

            @Override
            public void setChecked(boolean checked) {

            }

            @Override
            public void highlight() {

            }

            @Override
            public void unhighlight() {

            }

            @Override
            public boolean isHighlighted() {
                return false;
            }

            @Override
            public void setHighlightBrightness(float highlightBrightness) {

            }

            @Override
            public float getHighlightBrightness() {
                return 0;
            }

            @Override
            public void setQuickMode(boolean quickMode) {

            }

            @Override
            public void setClickable(boolean clickable) {

            }

            @Override
            public float getGlowBrightness() {
                return 0;
            }

            @Override
            public void setGlowBrightness(float glowBrightness) {

            }

            @Override
            public void setText(String text) {

            }

            @Override
            public String getText() {
                return null;
            }

            @Override
            public void setSkipPlayingPressedSoundOnce(boolean skipPlayingPressedSoundOnce) {

            }

            @Override
            public void setHighlightBounceDown(boolean b) {

            }

            @Override
            public void setShowTooltipWhileInactive(boolean showTooltipWhileInactive) {

            }

            @Override
            public void setRightClicksOkWhenDisabled(boolean rightClicksOkWhenDisabled) {

            }

            @Override
            public void setFlashBrightness(float flashBrightness) {

            }

            @Override
            public void flash(boolean withSound, float in, float out) {

            }

            @Override
            public void flash(boolean withSound) {

            }

            @Override
            public void flash() {

            }

            @Override
            public void setPerformActionWhenDisabled(boolean performActionWhenDisabled) {

            }

            @Override
            public boolean isPerformActionWhenDisabled() {
                return false;
            }

            @Override
            public boolean isSkipPlayingPressedSoundOnce() {
                return false;
            }

            @Override
            public Object getCustomData() {
                return null;
            }

            @Override
            public void setCustomData(Object customData) {

            }

            @Override
            public PositionAPI getPosition() {
                return null;
            }

            @Override
            public void render(float alphaMult) {

            }

            @Override
            public void processInput(List<InputEventAPI> events) {

            }

            @Override
            public void advance(float amount) {

            }
        };
    }

    @Override
    public void setBulletedListMode(String itemPrefix) {

    }

    @Override
    public void setBulletWidth(Float bulletWidth) {

    }

    @Override
    public UIComponentAPI addCustom(UIComponentAPI comp, float pad) {
        return null;
    }

    @Override
    public String getBulletedListPrefix() {
        return null;
    }

    @Override
    public void addImage(String spriteName, float width, float height, float pad) {

    }

    @Override
    public float getTextWidthOverride() {
        return 0;
    }

    @Override
    public void setTextWidthOverride(float textWidthOverride) {

    }

    @Override
    public void addImages(float width, float height, float pad, float imagePad, String... spriteNames) {

    }

    @Override
    public void resetGridRowHeight() {

    }

    @Override
    public void setLowGridRowHeight() {

    }

    @Override
    public void setGridRowHeight(float gridSize) {

    }

    @Override
    public String shortenString(String in, float maxWidth) {
        return null;
    }

    @Override
    public void addStatModGrid(float width, float valueWidth, float valuePad, float pad, MutableStat stat, boolean showNonMods, StatModValueGetter getter) {

    }

    @Override
    public void addShipList(int cols, int rows, float iconSize, Color baseColor, List<FleetMemberAPI> ships, float pad) {

    }

    @Override
    public void setParaFontOrbitron() {

    }

    @Override
    public LabelAPI addPara(String format, float pad, Color[] hl, String... highlights) {
        return null;
    }

    @Override
    public UIComponentAPI addSpacer(float height) {
        return null;
    }

    @Override
    public void addStoryPointUseInfo(float pad, float bonusXPFraction, boolean withNoSPNotification) {

    }

    @Override
    public void addStoryPointUseInfo(float pad, int numPoints, float bonusXPFraction, boolean withNoSPNotification) {

    }

    @Override
    public void setForceProcessInput(boolean forceProcessInput) {

    }

    @Override
    public void addPlaythroughDataPanel(float width, float height) {

    }

    @Override
    public void setBulletColor(Color bulletColor) {

    }

    @Override
    public void addRelationshipBar(PersonAPI person, float pad) {

    }

    @Override
    public void addRelationshipBar(PersonAPI person, float width, float pad) {

    }

    @Override
    public void addRelationshipBar(FactionAPI faction, float pad) {

    }

    @Override
    public void addRelationshipBar(FactionAPI faction, float width, float pad) {

    }

    @Override
    public void addRelationshipBar(float value, float pad) {

    }

    @Override
    public void addRelationshipBar(float value, float width, float pad) {

    }

    @Override
    public void addImportanceIndicator(PersonImportance importance, float width, float pad) {

    }

    @Override
    public void addTooltipToPrevious(TooltipCreator tc, TooltipLocation loc) {

    }

    @Override
    public ButtonAPI addAreaCheckbox(String text, Object data, Color base, Color bg, Color bright, float width, float height, float pad) {
        return null;
    }

    @Override
    public void showShips(List<FleetMemberAPI> ships, int max, boolean sort, boolean showBaseHullForDHulls, float pad) {

    }

    @Override
    public void setGridFontSmallInsignia() {

    }

    @Override
    public void showFullSurveyReqs(PlanetAPI planet, boolean withText, float pad) {

    }

    @Override
    public void showCost(String title, boolean withAvailable, float widthOverride, Color color, Color dark, float pad, String[] res, int[] quantities, boolean[] consumed) {

    }

    @Override
    public void showCost(String title, boolean withAvailable, Color color, Color dark, float pad, String[] res, int[] quantities) {

    }

    @Override
    public void showCost(Color color, Color dark, float pad, String[] res, int[] quantities) {

    }

    @Override
    public UIComponentAPI getPrev() {
        return null;
    }

    @Override
    public ButtonAPI addAreaCheckbox(String text, Object data, Color base, Color bg, Color bright, float width, float height, float pad, boolean leftAlign) {
        return null;
    }

    @Override
    public UIComponentAPI addSkillPanel(PersonAPI person, float pad) {
        return null;
    }

    @Override
    public float computeStringWidth(String in) {
        return 0;
    }

    @Override
    public TextFieldAPI addTextField(float width, float pad) {
        return null;
    }

    @Override
    public TextFieldAPI addTextField(float width, String font, float pad) {
        return null;
    }

    @Override
    public TextFieldAPI addTextField(float width, float height, String font, float pad) {
        return null;
    }

    @Override
    public ButtonAPI addCheckbox(float width, float height, String text, ButtonAPI.UICheckboxSize size, float pad) {
        return null;
    }

    @Override
    public ButtonAPI addCheckbox(float width, float height, String text, String font, Color textColor, ButtonAPI.UICheckboxSize size, float pad) {
        return null;
    }

    @Override
    public void setAreaCheckboxFont(String areaCheckboxFont) {

    }

    @Override
    public void setAreaCheckboxFontDefault() {

    }

    @Override
    public UIComponentAPI addLabelledValue(String label, String value, Color labelColor, Color valueColor, float width, float pad) {
        return null;
    }

    @Override
    public float getHeightSoFar() {
        return 0;
    }

    @Override
    public IntelUIAPI getIntelUI() {
        return null;
    }

    @Override
    public EventProgressBarAPI addEventProgressBar(BaseEventIntel intel, float pad) {
        return null;
    }

    @Override
    public UIComponentAPI addCustomDoNotSetPosition(UIComponentAPI comp) {
        return null;
    }

    @Override
    public UIComponentAPI addEventStageMarker(BaseEventIntel.EventStageDisplayData data) {
        return null;
    }

    @Override
    public UIComponentAPI addEventProgressMarker(BaseEventIntel intel) {
        return null;
    }

    @Override
    public TooltipMakerAPI beginImageWithText(String spriteName, float imageHeight, float widthWithImage, boolean midAlignImage) {
        return null;
    }

    @Override
    public LabelAPI addSectionHeading(String str, Color textColor, Color bgColor, Alignment align, float width, float pad) {
        return null;
    }

    @Override
    public TooltipMakerAPI beginSubTooltip(float width) {
        return null;
    }

    @Override
    public void endSubTooltip() {

    }

    @Override
    public void setHeightSoFar(float height) {

    }

    @Override
    public UIPanelAPI createSectorMap(float w, float h, MapParams p, String title) {
        return null;
    }

    @Override
    public UIPanelAPI createSectorMap(float w, float h, MapParams p, String title, Color color, Color dark) {
        return null;
    }

    @Override
    public float getWidthSoFar() {
        return 0;
    }

    @Override
    public void addTooltipToPrevious(TooltipCreator tc, TooltipLocation loc, boolean recreateEveryFrame) {

    }

    @Override
    public LabelAPI createLabel(String str, Color color) {
        return null;
    }

    @Override
    public LabelAPI createLabel(String str, Color color, float maxTextWidth) {
        return null;
    }

    @Override
    public void addTableHeaderTooltip(int colIndex, TooltipCreator tc) {

    }

    @Override
    public void addTableHeaderTooltip(int colIndex, String text) {

    }

    @Override
    public UIPanelAPI addSectorMap(float w, float h, StarSystemAPI system, float pad) {
        return null;
    }

    @Override
    public void addTooltipTo(TooltipCreator tc, UIComponentAPI to, TooltipLocation loc) {

    }

    @Override
    public void addTooltipTo(TooltipCreator tc, UIComponentAPI to, TooltipLocation loc, boolean recreateEveryFrame) {

    }

    @Override
    public UIComponentAPI createRect(Color color, float thickness) {
        return null;
    }

    @Override
    public void makeTableItemsClickable() {

    }

    @Override
    public void setIdForAddedRow(Object id) {

    }

    @Override
    public void setExternalScroller(ScrollPanelAPI scroller) {

    }

    @Override
    public ScrollPanelAPI getExternalScroller() {
        return null;
    }

    @Override
    public void setBgAlpha(float bgAlpha) {

    }

    @Override
    public void setButtonFontOrbitron20() {

    }

    @Override
    public void setButtonFontOrbitron20Bold() {

    }

    @Override
    public void setButtonFontOrbitron24() {

    }

    @Override
    public void setButtonFontOrbitron24Bold() {

    }

    @Override
    public UIComponentAPI addSkillPanelOneColumn(PersonAPI person, float pad) {
        return null;
    }

    @Override
    public void showPlanetInfo(PlanetAPI planet, float pad) {

    }

    @Override
    public void showPlanetInfo(PlanetAPI planet, float w, float h, boolean withName, float pad) {

    }

    @Override
    public ButtonAPI addCheckbox(float width, float height, String text, Object data, ButtonAPI.UICheckboxSize size, float pad) {
        return null;
    }

    @Override
    public ButtonAPI addCheckbox(float width, float height, String text, Object data, String font, Color textColor, ButtonAPI.UICheckboxSize size, float pad) {
        return null;
    }

    @Override
    public PositionAPI addComponent(UIComponentAPI custom) {
        return null;
    }

    @Override
    public void removeComponent(UIComponentAPI component) {

    }

    @Override
    public void bringComponentToTop(UIComponentAPI c) {

    }

    @Override
    public PositionAPI getPosition() {
        return null;
    }

    @Override
    public void render(float alphaMult) {

    }

    @Override
    public void processInput(List<InputEventAPI> events) {

    }

    @Override
    public void advance(float amount) {

    }
}
