package com.diamonddevgroup.utils;

import com.codename1.ui.Component;
import com.codename1.ui.Font;
import com.codename1.ui.Image;
import com.codename1.ui.plaf.Style;

/**
 * Helper class to apply styling in code to any component. This eliminates the
 * need to create multiple UIIDs.
 * <br><br>
 * Multiple styling can be applied through chaining.<br><br>
 * <strong>Example:</strong><br>
 * <code>new Helper(myLabel).py2().textDanger().textCenter()</code>
 *
 * @author Diamond
 */
public class Helper {

    Component cmp;

    /**
     * Root method to set component and begin chaining of other methods to apply
     * styling
     *
     * @param component component to apply styling to
     *
     */
    public Helper(Component component) {
        this.cmp = component;
        this.cmp.getAllStyles().setMarginUnit(Style.UNIT_TYPE_DIPS);
        this.cmp.getAllStyles().setPaddingUnit(Style.UNIT_TYPE_DIPS);
        //this.cmp.getUnselectedStyle().setBgTransparency(255);        
    }

    /**
     * Root method to set component, the unit and begin chaining of other
     * methods to apply styling
     *
     * @param component component to apply styling to
     * @param unit
     *
     */
    public Helper(Component component, byte unit) {
        this.cmp = component;
        this.cmp.getAllStyles().setMarginUnit(unit);
        this.cmp.getAllStyles().setPaddingUnit(unit);
        //this.cmp.getUnselectedStyle().setBgTransparency(255);        
    }

    /**
     * Applies 0 millimeters margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt0_() {
        this.cmp.getUnselectedStyle().setMarginTop(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb0_() {
        this.cmp.getUnselectedStyle().setMarginBottom(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml0_() {
        this.cmp.getUnselectedStyle().setMarginLeft(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr0_() {
        this.cmp.getUnselectedStyle().setMarginRight(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mx0_() {
        ml0_();
        mr0_();
        return this;
    }

    /**
     * Applies 0 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper my0_() {
        mt0_();
        mb0_();
        return this;
    }

    /**
     * Applies 0 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ma0_() {
        mt0_();
        mb0_();
        ml0_();
        mr0_();
        return this;
    }

    /**
     * Applies 1 millimeter margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt1_() {
        this.cmp.getUnselectedStyle().setMarginTop(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb1_() {
        this.cmp.getUnselectedStyle().setMarginBottom(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml1_() {
        this.cmp.getUnselectedStyle().setMarginLeft(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr1_() {
        this.cmp.getUnselectedStyle().setMarginRight(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mx1_() {
        ml1_();
        mr1_();
        return this;
    }

    /**
     * Applies 1 millimeter margin to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper my1_() {
        mt1_();
        mb1_();
        return this;
    }

    /**
     * Applies 1 millimeter margin to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ma1_() {
        mt1_();
        mb1_();
        ml1_();
        mr1_();
        return this;
    }

    /**
     * Applies 2 millimeters margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt2_() {
        this.cmp.getUnselectedStyle().setMarginTop(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb2_() {
        this.cmp.getUnselectedStyle().setMarginBottom(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml2_() {
        this.cmp.getUnselectedStyle().setMarginLeft(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr2_() {
        this.cmp.getUnselectedStyle().setMarginRight(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mx2_() {
        ml2_();
        mr2_();
        return this;
    }

    /**
     * Applies 2 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper my2_() {
        mt2_();
        mb2_();
        return this;
    }

    /**
     * Applies 2 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ma2_() {
        mt2_();
        mb2_();
        ml2_();
        mr2_();
        return this;
    }

    /**
     * Applies 3 millimeters margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt3_() {
        this.cmp.getUnselectedStyle().setMarginTop(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb3_() {
        this.cmp.getUnselectedStyle().setMarginBottom(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml3_() {
        this.cmp.getUnselectedStyle().setMarginLeft(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr3_() {
        this.cmp.getUnselectedStyle().setMarginRight(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mx3_() {
        ml3_();
        mr3_();
        return this;
    }

    /**
     * Applies 3 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper my3_() {
        mt3_();
        mb3_();
        return this;
    }

    /**
     * Applies 3 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ma3_() {
        mt3_();
        mb3_();
        ml3_();
        mr3_();
        return this;
    }

    /**
     * Applies 4 millimeters margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt4_() {
        this.cmp.getUnselectedStyle().setMarginTop(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb4_() {

        this.cmp.getUnselectedStyle().setMarginBottom(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml4_() {
        this.cmp.getUnselectedStyle().setMarginLeft(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr4_() {
        this.cmp.getUnselectedStyle().setMarginRight(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mx4_() {
        ml4_();
        mr4_();
        return this;
    }

    /**
     * Applies 4 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper my4_() {
        mt4_();
        mb4_();
        return this;
    }

    /**
     * Applies 4 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ma4_() {
        mt4_();
        mb4_();
        ml4_();
        mr4_();
        return this;
    }

    /**
     * Applies 5 millimeters margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt5_() {
        this.cmp.getUnselectedStyle().setMarginTop(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb5_() {
        this.cmp.getUnselectedStyle().setMarginBottom(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml5_() {
        this.cmp.getUnselectedStyle().setMarginLeft(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr5_() {
        this.cmp.getUnselectedStyle().setMarginRight(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mx5_() {
        ml5_();
        mr5_();
        return this;
    }

    /**
     * Applies 5 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper my5_() {
        mt5_();
        mb5_();
        return this;
    }

    /**
     * Applies 5 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ma5_() {
        mt5_();
        mb5_();
        ml5_();
        mr5_();
        return this;
    }

    /**
     * Applies 6 millimeters margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt6_() {
        this.cmp.getUnselectedStyle().setMarginTop(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb6_() {
        this.cmp.getUnselectedStyle().setMarginBottom(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml6_() {
        this.cmp.getUnselectedStyle().setMarginLeft(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr6_() {
        this.cmp.getUnselectedStyle().setMarginRight(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mx6_() {
        ml6_();
        mr6_();
        return this;
    }

    /**
     * Applies 6 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper my6_() {
        mt6_();
        mb6_();
        return this;
    }

    /**
     * Applies 6 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ma6_() {
        mt6_();
        mb6_();
        ml6_();
        mr6_();
        return this;
    }

    /**
     * Applies custom millimeters margin to top
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mt_(int size) {
        this.cmp.getUnselectedStyle().setMarginTop(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to bottom
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mb_(int size) {
        this.cmp.getUnselectedStyle().setMarginBottom(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to left
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper ml_(int size) {
        this.cmp.getUnselectedStyle().setMarginLeft(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to right
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mr_(int size) {
        this.cmp.getUnselectedStyle().setMarginRight(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to left and right
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mx_(int size) {
        ml_(size);
        mr_(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top and bottom
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper my_(int size) {
        mt_(size);
        mb_(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top, bottom, left and right
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper ma_(int size) {
        mt_(size);
        mb_(size);
        ml_(size);
        mr_(size);
        return this;
    }

    /**
     * Applies 0 millimeters padding to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pt0_() {
        this.cmp.getUnselectedStyle().setPaddingTop(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb0_() {
        this.cmp.getUnselectedStyle().setPaddingBottom(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl0_() {
        this.cmp.getUnselectedStyle().setPaddingLeft(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr0_() {
        this.cmp.getUnselectedStyle().setPaddingRight(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper px0_() {
        pl0_();
        pr0_();
        return this;
    }

    /**
     * Applies 0 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper py0_() {
        pt0_();
        pb0_();
        return this;
    }

    /**
     * Applies 0 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pa0_() {
        pt0_();
        pb0_();
        pl0_();
        pr0_();
        return this;
    }

    /**
     * Applies 1 millimeter padding to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pt1_() {
        this.cmp.getUnselectedStyle().setPaddingTop(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb1_() {
        this.cmp.getUnselectedStyle().setPaddingBottom(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl1_() {
        this.cmp.getUnselectedStyle().setPaddingLeft(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr1_() {
        this.cmp.getUnselectedStyle().setPaddingRight(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper px1_() {
        pl1_();
        pr1_();
        return this;
    }

    /**
     * Applies 1 millimeter padding to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper py1_() {
        pt1_();
        pb1_();
        return this;
    }

    /**
     * Applies 1 millimeter padding to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pa1_() {
        pt1_();
        pb1_();
        pl1_();
        pr1_();
        return this;
    }

    /**
     * Applies 2 millimeters padding to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pt2_() {
        this.cmp.getUnselectedStyle().setPaddingTop(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb2_() {
        this.cmp.getUnselectedStyle().setPaddingBottom(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl2_() {
        this.cmp.getUnselectedStyle().setPaddingLeft(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr2_() {
        this.cmp.getUnselectedStyle().setPaddingRight(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper px2_() {
        pl2_();
        pr2_();
        return this;
    }

    /**
     * Applies 2 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper py2_() {
        pt2_();
        pb2_();
        return this;
    }

    /**
     * Applies 2 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pa2_() {
        pt2_();
        pb2_();
        pl2_();
        pr2_();
        return this;
    }

    /**
     * Applies 3 millimeters padding to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pt3_() {
        this.cmp.getUnselectedStyle().setPaddingTop(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb3_() {
        this.cmp.getUnselectedStyle().setPaddingBottom(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl3_() {

        this.cmp.getUnselectedStyle().setPaddingLeft(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr3_() {
        this.cmp.getUnselectedStyle().setPaddingRight(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper px3_() {
        pl3_();
        pr3_();
        return this;
    }

    /**
     * Applies 3 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper py3_() {
        pt3_();
        pb3_();
        return this;
    }

    /**
     * Applies 3 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pa3_() {
        pt3_();
        pb3_();
        pl3_();
        pr3_();
        return this;
    }

    /**
     * Applies 4 millimeters padding to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pt4_() {
        this.cmp.getUnselectedStyle().setPaddingTop(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb4_() {
        this.cmp.getUnselectedStyle().setPaddingBottom(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl4_() {
        this.cmp.getUnselectedStyle().setPaddingLeft(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr4_() {
        this.cmp.getUnselectedStyle().setPaddingRight(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper px4_() {
        pl4_();
        pr4_();
        return this;
    }

    /**
     * Applies 4 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper py4_() {
        pt4_();
        pb4_();
        return this;
    }

    /**
     * Applies 4 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pa4_() {
        pt4_();
        pb4_();
        pl4_();
        pr4_();
        return this;
    }

    /**
     * Applies 5 millimeters padding to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pt5_() {
        this.cmp.getUnselectedStyle().setPaddingTop(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb5_() {
        this.cmp.getUnselectedStyle().setPaddingBottom(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl5_() {
        this.cmp.getUnselectedStyle().setPaddingLeft(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr5_() {
        this.cmp.getUnselectedStyle().setPaddingRight(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper px5_() {
        pl5_();
        pr5_();
        return this;
    }

    /**
     * Applies 5 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper py5_() {
        pt5_();
        pb5_();
        return this;
    }

    /**
     * Applies 5 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pa5_() {
        pt5_();
        pb5_();
        pl5_();
        pr5_();
        return this;
    }

    /**
     * Applies 6 millimeters padding to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pt6_() {
        this.cmp.getUnselectedStyle().setPaddingTop(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb6_() {
        this.cmp.getUnselectedStyle().setPaddingBottom(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl6_() {
        this.cmp.getUnselectedStyle().setPaddingLeft(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr6_() {
        this.cmp.getUnselectedStyle().setPaddingRight(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper px6_() {
        pl6_();
        pr6_();
        return this;
    }

    /**
     * Applies 6 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper py6_() {
        pt6_();
        pb6_();
        return this;
    }

    /**
     * Applies 6 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pa6_() {
        pt6_();
        pb6_();
        pl6_();
        pr6_();
        return this;
    }

    /**
     * Applies custom millimeters padding to top
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pt_(int size) {
        this.cmp.getAllStyles().setPaddingTop(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to bottom
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pb_(int size) {
        this.cmp.getAllStyles().setPaddingBottom(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to left
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pl_(int size) {
        this.cmp.getAllStyles().setPaddingLeft(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to right
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pr_(int size) {
        this.cmp.getAllStyles().setPaddingRight(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to left and right
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper px_(int size) {
        pl_(size);
        pr_(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top and bottom
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper py_(int size) {
        pt_(size);
        pb_(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top, bottom, left and right
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pa_(int size) {
        pt_(size);
        pb_(size);
        pl_(size);
        pr_(size);
        return this;
    }

    /**
     * Apply a custom text color
     *
     * @param color int color to apply to text
     * @return the component with the applied styling to unselected state
     */
    public Helper textColor_(int color) {
        this.cmp.getUnselectedStyle().setFgColor(color);
        return this;
    }

    /**
     * Mute a text to look disabled
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textMuted_() {
        this.cmp.getUnselectedStyle().setFgColor(0x818a91);
        return this;
    }

    /**
     * Primary text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textPrimary_() {
        this.cmp.getUnselectedStyle().setFgColor(0x145F80);
        return this;
    }

    /**
     * Success text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textSuccess_() {
        this.cmp.getUnselectedStyle().setFgColor(0x5cb85c);
        return this;
    }

    /**
     * Info text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textInfo_() {
        this.cmp.getUnselectedStyle().setFgColor(0x5bc0de);
        return this;
    }

    /**
     * Warning text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textWarning_() {
        this.cmp.getUnselectedStyle().setFgColor(0xf0ad4e);
        return this;
    }

    /**
     * Danger text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textDanger_() {
        this.cmp.getUnselectedStyle().setFgColor(0xd9534f);
        return this;
    }

    /**
     * Red text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textRed_() {
        this.cmp.getUnselectedStyle().setFgColor(0xf44336);
        return this;
    }

    /**
     * Pink text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textPink_() {
        this.cmp.getUnselectedStyle().setFgColor(0xe91e63);
        return this;
    }

    /**
     * Purple text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textPurple_() {
        this.cmp.getUnselectedStyle().setFgColor(0x9c27b0);
        return this;
    }

    /**
     * Deep purple text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textDeepPurple_() {
        this.cmp.getUnselectedStyle().setFgColor(0x673ab7);
        return this;
    }

    /**
     * Indigo text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textIndigo_() {
        this.cmp.getUnselectedStyle().setFgColor(0x3f51b5);
        return this;
    }

    /**
     * Blue text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBlue_() {
        this.cmp.getUnselectedStyle().setFgColor(0x2196F3);
        return this;
    }

    /**
     * Light blue text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLightBlue_() {
        this.cmp.getUnselectedStyle().setFgColor(0x03a9f4);
        return this;
    }

    /**
     * Cyan text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textCyan_() {
        this.cmp.getUnselectedStyle().setFgColor(0x00bcd4);
        return this;
    }

    /**
     * Teal text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textTeal_() {
        this.cmp.getUnselectedStyle().setFgColor(0x009688);
        return this;
    }

    /**
     * Green text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textGreen_() {
        this.cmp.getUnselectedStyle().setFgColor(0x4caf50);
        return this;
    }

    /**
     * Light green text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLightGreen_() {
        this.cmp.getUnselectedStyle().setFgColor(0x8bc34a);
        return this;
    }

    /**
     * Lime text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLime_() {
        this.cmp.getUnselectedStyle().setFgColor(0xcddc39);
        return this;
    }

    /**
     * Yellow text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textYellow_() {
        this.cmp.getUnselectedStyle().setFgColor(0xffeb3b);
        return this;
    }

    /**
     * Amber text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textAmber_() {
        this.cmp.getUnselectedStyle().setFgColor(0xffc107);
        return this;
    }

    /**
     * Orange text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textOrange_() {
        this.cmp.getUnselectedStyle().setFgColor(0xff9800);
        return this;
    }

    /**
     * Deep orange text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textDeepOrange_() {
        this.cmp.getUnselectedStyle().setFgColor(0xff5722);
        return this;
    }

    /**
     * Brown text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBrown_() {
        this.cmp.getUnselectedStyle().setFgColor(0x795548);
        return this;
    }

    /**
     * Grey text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textGrey_() {
        this.cmp.getUnselectedStyle().setFgColor(0x9e9e9e);
        return this;
    }

    /**
     * Blue-grey text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBlueGrey_() {
        this.cmp.getUnselectedStyle().setFgColor(0x607d8b);
        return this;
    }

    /**
     * Black text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBlack_() {
        this.cmp.getUnselectedStyle().setFgColor(0x000000);
        return this;
    }

    /**
     * White text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textWhite_() {
        this.cmp.getUnselectedStyle().setFgColor(0xffffff);
        return this;
    }

    /**
     * Apply a custom background color
     *
     * @param color int color to apply to background
     * @return the component with the applied styling to unselected state
     */
    public Helper bgColor_(int color) {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(color);
        return this;
    }
    
    /**
     * Apply a custom background color
     *
     * @param color int color to apply to background
     * @return the component with the applied styling to pressed state
     */
    public Helper bgColor___(int color) {
        this.cmp.getPressedStyle().setBgTransparency(255);
        this.cmp.getPressedStyle().setBgColor(color);
        return this;
    }

    /**
     * Mute a text to look disabled
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgMuted_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x818a91);
        return this;
    }

    /**
     * Primary background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgPrimary_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x145F80);
        return this;
    }

    /**
     * Success background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgSuccess_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x5cb85c);
        return this;
    }

    /**
     * Info background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgInfo_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x5bc0de);
        return this;
    }

    /**
     * Warning background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgWarning_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xf0ad4e);
        return this;
    }

    /**
     * Danger background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgDanger_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xd9534f);
        return this;
    }

    /**
     * Red background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgRed_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xf44336);
        return this;
    }

    /**
     * Pink background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgPink_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xe91e63);
        return this;
    }

    /**
     * Purple background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgPurple_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x9c27b0);
        return this;
    }

    /**
     * Deep purple background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgDeepPurple_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x673ab7);
        return this;
    }

    /**
     * Indigo background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgIndigo_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x3f51b5);
        return this;
    }

    /**
     * Blue background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBlue_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x2196F3);
        return this;
    }

    /**
     * Light blue background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLightBlue_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x03a9f4);
        return this;
    }

    /**
     * Cyan background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgCyan_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x00bcd4);
        return this;
    }

    /**
     * Teal background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgTeal_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x009688);
        return this;
    }

    /**
     * Green background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgGreen_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x4caf50);
        return this;
    }

    /**
     * Light green background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLightGreen_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x8bc34a);
        return this;
    }

    /**
     * Lime background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLime_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xcddc39);
        return this;
    }

    /**
     * Yellow background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgYellow_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xffeb3b);
        return this;
    }

    /**
     * Amber background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgAmber_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xffc107);
        return this;
    }

    /**
     * Orange background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgOrange_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xff9800);
        return this;
    }

    /**
     * Deep orange background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgDeepOrange_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xff5722);
        return this;
    }

    /**
     * Brown background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBrown_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x795548);
        return this;
    }

    /**
     * Grey background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgGrey_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x9e9e9e);
        return this;
    }

    /**
     * Light-grey background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLightGrey_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xebebeb);
        return this;
    }

    /**
     * Blue-grey background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBlueGrey_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x607d8b);
        return this;
    }

    /**
     * Black background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBlack_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0x000000);
        return this;
    }

    /**
     * White background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgWhite_() {
        this.cmp.getUnselectedStyle().setBgTransparency(255);
        this.cmp.getUnselectedStyle().setBgColor(0xffffff);
        return this;
    }

    /**
     * Applies small size to text
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textSmall_() {
        Font font = this.cmp.getUnselectedStyle().getFont();
        font.derive(Font.SIZE_SMALL, Font.STYLE_PLAIN);
        this.cmp.getUnselectedStyle().setFont(font, true);
        return this;
    }

    /**
     * Applies medium size to text
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textMedium_() {
        Font font = this.cmp.getUnselectedStyle().getFont();
        font.derive(Font.SIZE_MEDIUM, Font.STYLE_PLAIN);
        this.cmp.getUnselectedStyle().setFont(font, true);
        return this;
    }

    /**
     * Applies large size to text
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLarge_() {
        Font font = this.cmp.getUnselectedStyle().getFont();
        font.derive(Font.SIZE_LARGE, Font.STYLE_PLAIN);
        this.cmp.getUnselectedStyle().setFont(font, true);
        return this;
    }

    /**
     * Makes text bold
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBold_() {
        this.cmp.getUnselectedStyle().setFont(Font.createTrueTypeFont("native:MainBold", "native:MainBold"), true);
        return this;
    }

    /**
     * Makes text thin
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textThin_() {
        this.cmp.getUnselectedStyle().setFont(Font.createTrueTypeFont("native:MainThin", "native:MainThin"), true);
        return this;
    }

    /**
     * Makes text italics
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textItalics_() {
        this.cmp.getUnselectedStyle().setFont(Font.createTrueTypeFont("native:MainThin", "native:ItalicLight"), true);
        return this;
    }

    /**
     * Align text to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLeft_() {
        this.cmp.getUnselectedStyle().setAlignment(Component.LEFT);
        return this;
    }

    /**
     * Align text to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textRight_() {
        this.cmp.getUnselectedStyle().setAlignment(Component.RIGHT);
        return this;
    }

    /**
     * Align text to center
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textCenter_() {
        this.cmp.getUnselectedStyle().setAlignment(Component.CENTER);
        return this;
    }

    /**
     * THIS SECTION APPLIES STYLING TO ALL STATES
     */
    /**
     * Applies 0 millimeters margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt0() {
        this.cmp.getAllStyles().setMarginTop(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb0() {
        this.cmp.getAllStyles().setMarginBottom(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml0() {
        this.cmp.getAllStyles().setMarginLeft(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr0() {
        this.cmp.getAllStyles().setMarginRight(0);
        return this;
    }

    /**
     * Applies 0 millimeters margin to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mx0() {
        ml0();
        mr0();
        return this;
    }

    /**
     * Applies 0 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper my0() {
        mt0();
        mb0();
        return this;
    }

    /**
     * Applies 0 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper ma0() {
        mt0();
        mb0();
        ml0();
        mr0();
        return this;
    }

    /**
     * Applies 1 millimeter margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt1() {
        this.cmp.getAllStyles().setMarginTop(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb1() {
        this.cmp.getAllStyles().setMarginBottom(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml1() {
        this.cmp.getAllStyles().setMarginLeft(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr1() {
        this.cmp.getAllStyles().setMarginRight(1);
        return this;
    }

    /**
     * Applies 1 millimeter margin to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mx1() {
        ml1();
        mr1();
        return this;
    }

    /**
     * Applies 1 millimeter margin to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper my1() {
        mt1();
        mb1();
        return this;
    }

    /**
     * Applies 1 millimeter margin to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper ma1() {
        mt1();
        mb1();
        ml1();
        mr1();
        return this;
    }

    /**
     * Applies 2 millimeters margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt2() {
        this.cmp.getAllStyles().setMarginTop(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb2() {
        this.cmp.getAllStyles().setMarginBottom(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml2() {
        this.cmp.getAllStyles().setMarginLeft(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr2() {
        this.cmp.getAllStyles().setMarginRight(2);
        return this;
    }

    /**
     * Applies 2 millimeters margin to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mx2() {
        ml2();
        mr2();
        return this;
    }

    /**
     * Applies 2 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper my2() {
        mt2();
        mb2();
        return this;
    }

    /**
     * Applies 2 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper ma2() {
        mt2();
        mb2();
        ml2();
        mr2();
        return this;
    }

    /**
     * Applies 3 millimeters margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt3() {
        this.cmp.getAllStyles().setMarginTop(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb3() {
        this.cmp.getAllStyles().setMarginBottom(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml3() {
        this.cmp.getAllStyles().setMarginLeft(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr3() {
        this.cmp.getAllStyles().setMarginRight(3);
        return this;
    }

    /**
     * Applies 3 millimeters margin to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mx3() {
        ml3();
        mr3();
        return this;
    }

    /**
     * Applies 3 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper my3() {
        mt3();
        mb3();
        return this;
    }

    /**
     * Applies 3 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper ma3() {
        mt3();
        mb3();
        ml3();
        mr3();
        return this;
    }

    /**
     * Applies 4 millimeters margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt4() {
        this.cmp.getAllStyles().setMarginTop(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb4() {
        this.cmp.getAllStyles().setMarginBottom(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml4() {
        this.cmp.getAllStyles().setMarginLeft(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr4() {
        this.cmp.getAllStyles().setMarginRight(4);
        return this;
    }

    /**
     * Applies 4 millimeters margin to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mx4() {
        ml4();
        mr4();
        return this;
    }

    /**
     * Applies 4 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper my4() {
        mt4();
        mb4();
        return this;
    }

    /**
     * Applies 4 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper ma4() {
        mt4();
        mb4();
        ml4();
        mr4();
        return this;
    }

    /**
     * Applies 5 millimeters margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt5() {
        this.cmp.getAllStyles().setMarginTop(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb5() {
        this.cmp.getAllStyles().setMarginBottom(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml5() {
        this.cmp.getAllStyles().setMarginLeft(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr5() {
        this.cmp.getAllStyles().setMarginRight(5);
        return this;
    }

    /**
     * Applies 5 millimeters margin to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mx5() {
        ml5();
        mr5();
        return this;
    }

    /**
     * Applies 5 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper my5() {
        mt5();
        mb5();
        return this;
    }

    /**
     * Applies 5 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper ma5() {
        mt5();
        mb5();
        ml5();
        mr5();
        return this;
    }

    /**
     * Applies 6 millimeters margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt6() {
        this.cmp.getAllStyles().setMarginTop(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb6() {
        this.cmp.getAllStyles().setMarginBottom(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml6() {
        this.cmp.getAllStyles().setMarginLeft(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr6() {
        this.cmp.getAllStyles().setMarginRight(6);
        return this;
    }

    /**
     * Applies 6 millimeters margin to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mx6() {
        ml6();
        mr6();
        return this;
    }

    /**
     * Applies 6 millimeters margin to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper my6() {
        mt6();
        mb6();
        return this;
    }

    /**
     * Applies 6 millimeters margin to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper ma6() {
        mt6();
        mb6();
        ml6();
        mr6();
        return this;
    }

    /**
     * Applies custom millimeters margin to top
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mt(int size) {
        this.cmp.getAllStyles().setMarginTop(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to bottom
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mb(int size) {
        this.cmp.getAllStyles().setMarginBottom(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to left
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper ml(int size) {
        this.cmp.getAllStyles().setMarginLeft(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to right
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mr(int size) {
        this.cmp.getAllStyles().setMarginRight(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to left and right
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper mx(int size) {
        ml(size);
        mr(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top and bottom
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper my(int size) {
        mt(size);
        mb(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top, bottom, left and right
     *
     * @param size
     * @return the component with the applied styling to unselected state
     */
    public Helper ma(int size) {
        mt(size);
        mb(size);
        ml(size);
        mr(size);
        return this;
    }

    /**
     * Applies 0 millimeters padding to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper pt0() {
        this.cmp.getAllStyles().setPaddingTop(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb0() {
        this.cmp.getAllStyles().setPaddingBottom(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl0() {
        this.cmp.getAllStyles().setPaddingLeft(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr0() {
        this.cmp.getAllStyles().setPaddingRight(0);
        return this;
    }

    /**
     * Applies 0 millimeters padding to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper px0() {
        pl0();
        pr0();
        return this;
    }

    /**
     * Applies 0 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper py0() {
        pt0();
        pb0();
        return this;
    }

    /**
     * Applies 0 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pa0() {
        pt0();
        pb0();
        pl0();
        pr0();
        return this;
    }

    /**
     * Applies 1 millimeter padding to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper pt1() {
        this.cmp.getAllStyles().setPaddingTop(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb1() {
        this.cmp.getAllStyles().setPaddingBottom(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl1() {
        this.cmp.getAllStyles().setPaddingLeft(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr1() {
        this.cmp.getAllStyles().setPaddingRight(1);
        return this;
    }

    /**
     * Applies 1 millimeter padding to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper px1() {
        pl1();
        pr1();
        return this;
    }

    /**
     * Applies 1 millimeter padding to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper py1() {
        pt1();
        pb1();
        return this;
    }

    /**
     * Applies 1 millimeter padding to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pa1() {
        pt1();
        pb1();
        pl1();
        pr1();
        return this;
    }

    /**
     * Applies 2 millimeters padding to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper pt2() {
        this.cmp.getAllStyles().setPaddingTop(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb2() {
        this.cmp.getAllStyles().setPaddingBottom(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl2() {
        this.cmp.getAllStyles().setPaddingLeft(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr2() {
        this.cmp.getAllStyles().setPaddingRight(2);
        return this;
    }

    /**
     * Applies 2 millimeters padding to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper px2() {
        pl2();
        pr2();
        return this;
    }

    /**
     * Applies 2 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper py2() {
        pt2();
        pb2();
        return this;
    }

    /**
     * Applies 2 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pa2() {
        pt2();
        pb2();
        pl2();
        pr2();
        return this;
    }

    /**
     * Applies 3 millimeters padding to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper pt3() {
        this.cmp.getAllStyles().setPaddingTop(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb3() {
        this.cmp.getAllStyles().setPaddingBottom(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl3() {
        this.cmp.getAllStyles().setPaddingLeft(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr3() {
        this.cmp.getAllStyles().setPaddingRight(3);
        return this;
    }

    /**
     * Applies 3 millimeters padding to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper px3() {
        pl3();
        pr3();
        return this;
    }

    /**
     * Applies 3 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper py3() {
        pt3();
        pb3();
        return this;
    }

    /**
     * Applies 3 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pa3() {
        pt3();
        pb3();
        pl3();
        pr3();
        return this;
    }

    /**
     * Applies 4 millimeters padding to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper pt4() {
        this.cmp.getAllStyles().setPaddingTop(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb4() {
        this.cmp.getAllStyles().setPaddingBottom(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl4() {
        this.cmp.getAllStyles().setPaddingLeft(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr4() {
        this.cmp.getAllStyles().setPaddingRight(4);
        return this;
    }

    /**
     * Applies 4 millimeters padding to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper px4() {
        pl4();
        pr4();
        return this;
    }

    /**
     * Applies 4 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper py4() {
        pt4();
        pb4();
        return this;
    }

    /**
     * Applies 4 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pa4() {
        pt4();
        pb4();
        pl4();
        pr4();
        return this;
    }

    /**
     * Applies 5 millimeters padding to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper pt5() {
        this.cmp.getAllStyles().setPaddingTop(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb5() {
        this.cmp.getAllStyles().setPaddingBottom(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl5() {
        this.cmp.getAllStyles().setPaddingLeft(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr5() {
        this.cmp.getAllStyles().setPaddingRight(5);
        return this;
    }

    /**
     * Applies 5 millimeters padding to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper px5() {
        pl5();
        pr5();
        return this;
    }

    /**
     * Applies 5 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper py5() {
        pt5();
        pb5();
        return this;
    }

    /**
     * Applies 5 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pa5() {
        pt5();
        pb5();
        pl5();
        pr5();
        return this;
    }

    /**
     * Applies 6 millimeters padding to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper pt6() {
        this.cmp.getAllStyles().setPaddingTop(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb6() {
        this.cmp.getAllStyles().setPaddingBottom(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl6() {
        this.cmp.getAllStyles().setPaddingLeft(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr6() {
        this.cmp.getAllStyles().setPaddingRight(6);
        return this;
    }

    /**
     * Applies 6 millimeters padding to left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper px6() {
        pl6();
        pr6();
        return this;
    }

    /**
     * Applies 6 millimeters padding to top and bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper py6() {
        pt6();
        pb6();
        return this;
    }

    /**
     * Applies 6 millimeters padding to top, bottom, left and right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pa6() {
        pt6();
        pb6();
        pl6();
        pr6();
        return this;
    }

    /**
     * Applies custom millimeters padding to top
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pt(int size) {
        this.cmp.getAllStyles().setPaddingTop(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to bottom
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pb(int size) {
        this.cmp.getAllStyles().setPaddingBottom(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to left
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pl(int size) {
        this.cmp.getAllStyles().setPaddingLeft(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to right
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pr(int size) {
        this.cmp.getAllStyles().setPaddingRight(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to left and right
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper px(int size) {
        pl(size);
        pr(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top and bottom
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper py(int size) {
        pt(size);
        pb(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top, bottom, left and right
     *
     * @param size
     * @return the component with the applied styling to all states
     */
    public Helper pa(int size) {
        pt(size);
        pb(size);
        pl(size);
        pr(size);
        return this;
    }

    /**
     * Apply a custom text color
     *
     * @param color int color to apply to text
     * @return the component with the applied styling to all states
     */
    public Helper textColor(int color) {
        this.cmp.getAllStyles().setFgColor(color);
        return this;
    }
    
    /**
     * Apply a custom text color
     *
     * @param color int color to apply to text
     * @return the component with the applied styling to pressed state
     */
    public Helper textColor___(int color) {
        this.cmp.getPressedStyle().setFgColor(color);
        return this;
    }

    /**
     * Mute a text to look disabled
     *
     * @return the component with the applied styling to all states
     */
    public Helper textMuted() {
        this.cmp.getAllStyles().setFgColor(0x818a91);
        return this;
    }

    /**
     * Primary text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textPrimary() {
        this.cmp.getAllStyles().setFgColor(0x145F80);
        return this;
    }

    /**
     * Success text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textSuccess() {
        this.cmp.getAllStyles().setFgColor(0x5cb85c);
        return this;
    }

    /**
     * Info text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textInfo() {
        this.cmp.getAllStyles().setFgColor(0x5bc0de);
        return this;
    }

    /**
     * Warning text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textWarning() {
        this.cmp.getAllStyles().setFgColor(0xf0ad4e);
        return this;
    }

    /**
     * Danger text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textDanger() {
        this.cmp.getAllStyles().setFgColor(0xd9534f);
        return this;
    }

    /**
     * Red text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textRed() {
        this.cmp.getAllStyles().setFgColor(0xf44336);
        return this;
    }

    /**
     * Pink text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textPink() {
        this.cmp.getAllStyles().setFgColor(0xe91e63);
        return this;
    }

    /**
     * Purple text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textPurple() {
        this.cmp.getAllStyles().setFgColor(0x9c27b0);
        return this;
    }

    /**
     * Deep purple text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textDeepPurple() {
        this.cmp.getAllStyles().setFgColor(0x673ab7);
        return this;
    }

    /**
     * Indigo text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textIndigo() {
        this.cmp.getAllStyles().setFgColor(0x3f51b5);
        return this;
    }

    /**
     * Blue text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBlue() {
        this.cmp.getAllStyles().setFgColor(0x2196F3);
        return this;
    }

    /**
     * Light blue text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLightBlue() {
        this.cmp.getAllStyles().setFgColor(0x03a9f4);
        return this;
    }

    /**
     * Cyan text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textCyan() {
        this.cmp.getAllStyles().setFgColor(0x00bcd4);
        return this;
    }

    /**
     * Teal text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textTeal() {
        this.cmp.getAllStyles().setFgColor(0x009688);
        return this;
    }

    /**
     * Green text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textGreen() {
        this.cmp.getAllStyles().setFgColor(0x4caf50);
        return this;
    }

    /**
     * Light green text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLightGreen() {
        this.cmp.getAllStyles().setFgColor(0x8bc34a);
        return this;
    }

    /**
     * Lime text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLime() {
        this.cmp.getAllStyles().setFgColor(0xcddc39);
        return this;
    }

    /**
     * Yellow text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textYellow() {
        this.cmp.getAllStyles().setFgColor(0xffeb3b);
        return this;
    }

    /**
     * Amber text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textAmber() {
        this.cmp.getAllStyles().setFgColor(0xffc107);
        return this;
    }

    /**
     * Orange text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textOrange() {
        this.cmp.getAllStyles().setFgColor(0xff9800);
        return this;
    }

    /**
     * Deep orange text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textDeepOrange() {
        this.cmp.getAllStyles().setFgColor(0xff5722);
        return this;
    }

    /**
     * Brown text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBrown() {
        this.cmp.getAllStyles().setFgColor(0x795548);
        return this;
    }

    /**
     * Grey text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textGrey() {
        this.cmp.getAllStyles().setFgColor(0x9e9e9e);
        return this;
    }

    /**
     * Blue-grey text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBlueGrey() {
        this.cmp.getAllStyles().setFgColor(0x607d8b);
        return this;
    }

    /**
     * Black text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBlack() {
        this.cmp.getAllStyles().setFgColor(0x000000);
        return this;
    }

    /**
     * White text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textWhite() {
        this.cmp.getAllStyles().setFgColor(0xffffff);
        return this;
    }

    /**
     * Apply a custom background image that fills the background
     *
     * @param image Image to apply to background
     * @return the component with the applied styling to all states
     */
    public Helper bgImage(Image image) {
        this.cmp.getAllStyles().setBgTransparency(0);
        this.cmp.getAllStyles().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED_FILL);
        this.cmp.getAllStyles().setBgImage(image);
        return this;
    }
    
    /**
     * Apply a custom background color
     *
     * @param color int color to apply to background
     * @return the component with the applied styling to all states
     */
    public Helper bgColor(int color) {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(color);
        return this;
    }

    /**
     * Mute a background to look disabled
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgMuted() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x818a91);
        return this;
    }

    /**
     * Primary background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgPrimary() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x145F80);
        return this;
    }

    /**
     * Success background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgSuccess() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x5cb85c);
        return this;
    }

    /**
     * Info background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgInfo() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x5bc0de);
        return this;
    }

    /**
     * Warning background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgWarning() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xf0ad4e);
        return this;
    }

    /**
     * Danger background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgDanger() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xd9534f);
        return this;
    }

    /**
     * Red background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgRed() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xf44336);
        return this;
    }

    /**
     * Pink background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgPink() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xe91e63);
        return this;
    }

    /**
     * Purple background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgPurple() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x9c27b0);
        return this;
    }

    /**
     * Deep purple background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgDeepPurple() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x673ab7);
        return this;
    }

    /**
     * Indigo background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgIndigo() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x3f51b5);
        return this;
    }

    /**
     * Blue background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBlue() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x2196F3);
        return this;
    }

    /**
     * Light blue background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLightBlue() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x03a9f4);
        return this;
    }

    /**
     * Cyan background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgCyan() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x00bcd4);
        return this;
    }

    /**
     * Teal background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgTeal() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x009688);
        return this;
    }

    /**
     * Green background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgGreen() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x4caf50);
        return this;
    }

    /**
     * Light green background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLightGreen() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x8bc34a);
        return this;
    }

    /**
     * Lime background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLime() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xcddc39);
        return this;
    }

    /**
     * Yellow background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgYellow() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xffeb3b);
        return this;
    }

    /**
     * Amber background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgAmber() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xffc107);
        return this;
    }

    /**
     * Orange background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgOrange() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xff9800);
        return this;
    }

    /**
     * Deep orange background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgDeepOrange() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xff5722);
        return this;
    }

    /**
     * Brown background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBrown() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x795548);
        return this;
    }

    /**
     * Grey background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgGrey() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x9e9e9e);
        return this;
    }

    /**
     * Light-grey background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLightGrey() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xebebeb);
        return this;
    }

    /**
     * Blue-grey background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBlueGrey() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x607d8b);
        return this;
    }

    /**
     * Black background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBlack() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0x000000);
        return this;
    }

    /**
     * White background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgWhite() {
        this.cmp.getAllStyles().setBgTransparency(255);
        this.cmp.getAllStyles().setBgColor(0xffffff);
        return this;
    }

    /**
     * Applies small size to text
     *
     * @return the component with the applied styling to all states
     */
    public Helper textSmall() {
        Font font = this.cmp.getUnselectedStyle().getFont();
        font.derive(Font.SIZE_SMALL, Font.STYLE_PLAIN);
        this.cmp.getAllStyles().setFont(font, true);
        return this;
    }

    /**
     * Applies medium size to text
     *
     * @return the component with the applied styling to all states
     */
    public Helper textMedium() {
        Font font = this.cmp.getUnselectedStyle().getFont();
        font.derive(Font.SIZE_MEDIUM, Font.STYLE_PLAIN);
        this.cmp.getAllStyles().setFont(font, true);
        return this;
    }

    /**
     * Applies large size to text
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLarge() {
        Font font = this.cmp.getUnselectedStyle().getFont();
        font.derive(Font.SIZE_LARGE, Font.STYLE_PLAIN);
        this.cmp.getAllStyles().setFont(font, true);
        return this;
    }

    /**
     * Makes text bold
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBold() {
        this.cmp.getAllStyles().setFont(Font.createTrueTypeFont("native:MainBold", "native:MainBold"), true);
        return this;
    }

    /**
     * Makes text thin
     *
     * @return the component with the applied styling to all states
     */
    public Helper textThin() {
        this.cmp.getAllStyles().setFont(Font.createTrueTypeFont("native:MainThin", "native:MainThin"), true);
        return this;
    }

    /**
     * Makes text italics
     *
     * @return the component with the applied styling to all states
     */
    public Helper textItalics() {
        this.cmp.getAllStyles().setFont(Font.createTrueTypeFont("native:MainThin", "native:ItalicLight"), true);
        return this;
    }

    /**
     * Align text to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLeft() {
        this.cmp.getAllStyles().setAlignment(Component.LEFT);
        return this;
    }

    /**
     * Align text to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper textRight() {
        this.cmp.getAllStyles().setAlignment(Component.RIGHT);
        return this;
    }

    /**
     * Align text to center
     *
     * @return the component with the applied styling to all states
     */
    public Helper textCenter() {
        this.cmp.getAllStyles().setAlignment(Component.CENTER);
        return this;
    }

}
