package com.diamonddevgroup.utils;

import com.codename1.ui.CN;
import com.codename1.ui.Component;
import com.codename1.ui.Font;
import com.codename1.ui.Image;
import com.codename1.ui.plaf.Style;

/**
 * A Helper library for basic styling using code in Codename One. This
 * eliminates the need to have endless UIID in your GUI builder
 * <br><br>
 * Multiple styling can be applied through chaining.<br><br>
 * <strong>Example:</strong><br>
 * <code>new Helper(myLabel).py2().textDanger().textCenter()</code>
 *
 * @author Diamond
 */
public class Helper {

    Component[] cmps;
    int bg_trans;

    /**
     * Root method to set component and begin chaining of other methods to apply
     * styling
     *
     * @param component component to apply styling to
     *
     */
    public Helper(Component... component) {
        this.cmps = component;
        this.bg_trans = 255;
        for (Component c : cmps) {
            c.getAllStyles().setMarginUnit(Style.UNIT_TYPE_DIPS);
            c.getAllStyles().setPaddingUnit(Style.UNIT_TYPE_DIPS);
        }
    }

    /**
     * Root method to set component, the unit and begin chaining of other
     * methods to apply styling
     *
     * @param component component to apply styling to
     * @param unit unit of measurement, one of {@code Style.UNIT_TYPE_DIPS,
     * Style.UNIT_TYPE_PIXELS, Style.UNIT_TYPE_SCREEN_PERCENTAGE}
     *
     */
    public Helper(byte unit, Component... component) {
        this.cmps = component;
        this.bg_trans = 255;
        for (Component c : cmps) {
            c.getAllStyles().setMarginUnit(unit);
            c.getAllStyles().setPaddingUnit(unit);
        }
    }

    /**
     * Root method to set component, the background transparency and begin
     * chaining of other methods to apply styling
     *
     * @param unit unit of measurement, one of {@code Style.UNIT_TYPE_DIPS,
     * Style.UNIT_TYPE_PIXELS, Style.UNIT_TYPE_SCREEN_PERCENTAGE}
     * @param bgTrans background transparency between 0 and 255
     * @param component component to apply styling to
     *
     */
    public Helper(byte unit, int bgTrans, Component... component) {
        this.cmps = component;
        this.bg_trans = 255;
        for (Component c : cmps) {
            c.getAllStyles().setMarginUnit(unit);
            c.getAllStyles().setPaddingUnit(unit);
            if (bgTrans >= 0 && bgTrans <= 255) {
                this.bg_trans = bgTrans;
            }
        }
    }

    /**
     * Root method to set component, the background transparency and begin
     * chaining of other methods to apply styling
     *
     * @param component component to apply styling to
     * @param bgTrans background transparency between 0 and 255
     *
     */
    public Helper(int bgTrans, Component... component) {
        this.cmps = component;
        for (Component c : cmps) {
            if (bgTrans >= 0 && bgTrans <= 255) {
                this.bg_trans = bgTrans;
            }
        }
    }

    /**
     * Root method to set component, the unit and begin chaining of other
     * methods to apply styling
     *
     * @param component component to apply styling to
     * @param unit unit of measurement, one of {@code Style.UNIT_TYPE_DIPS,
     * Style.UNIT_TYPE_PIXELS, Style.UNIT_TYPE_SCREEN_PERCENTAGE}
     *
     */
    public Helper(Component component, byte unit) {
        component.getAllStyles().setMarginUnit(unit);
        component.getAllStyles().setPaddingUnit(unit);
        this.cmps = new Component[]{component};
        this.bg_trans = 255;
    }

    /**
     * Applies 0 millimeters margin to top
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mt0_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb0_() {

        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml0_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr0_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(0);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb1_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml1_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr1_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(1);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb2_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml2_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr2_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(2);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb3_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml3_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr3_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(3);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb4_() {

        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml4_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr4_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(4);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb5_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml5_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr5_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(5);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters margin to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mb6_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters margin to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper ml6_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters margin to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper mr6_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(6);
        }
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
     * @param size in millimeters to apply to top margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mt_(int size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to top
     *
     * @param size in millimeters to apply to top margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mt_(float size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to bottom
     *
     * @param size in millimeters to apply to bottom margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mb_(int size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to bottom
     *
     * @param size in millimeters to apply to bottom margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mb_(float size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to left
     *
     * @param size in millimeters to apply to left margin
     * @return the component with the applied styling to unselected state
     */
    public Helper ml_(int size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to left
     *
     * @param size in millimeters to apply to left margin
     * @return the component with the applied styling to unselected state
     */
    public Helper ml_(float size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to right
     *
     * @param size in millimeters to apply to right margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mr_(int size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to right
     *
     * @param size in millimeters to apply to right margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mr_(float size) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setMarginRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to left and right
     *
     * @param size in millimeters to apply to left and right margins
     * @return the component with the applied styling to unselected state
     */
    public Helper mx_(int size) {
        ml_(size);
        mr_(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to left and right
     *
     * @param size in millimeters to apply to left and right margins
     * @return the component with the applied styling to unselected state
     */
    public Helper mx_(float size) {
        ml_(size);
        mr_(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top and bottom
     *
     * @param size in millimeters to apply to top and bottom margins
     * @return the component with the applied styling to unselected state
     */
    public Helper my_(int size) {
        mt_(size);
        mb_(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top and bottom
     *
     * @param size in millimeters to apply to top and bottom margins
     * @return the component with the applied styling to unselected state
     */
    public Helper my_(float size) {
        mt_(size);
        mb_(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top, bottom, left and right
     *
     * @param size in millimeters to apply to all margin
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
     * Applies custom millimeters margin to top, bottom, left and right
     *
     * @param size in millimeters to apply to all margin
     * @return the component with the applied styling to unselected state
     */
    public Helper ma_(float size) {
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingTop(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb0_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingBottom(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl0_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingLeft(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr0_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingRight(0);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingTop(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb1_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingBottom(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl1_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingLeft(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr1_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingRight(1);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingTop(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb2_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingBottom(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl2_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingLeft(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr2_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingRight(2);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingTop(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb3_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingBottom(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl3_() {

        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingLeft(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr3_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingRight(3);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingTop(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb4_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingBottom(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl4_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingLeft(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr4_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingRight(4);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingTop(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb5_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingBottom(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl5_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingLeft(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr5_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingRight(5);
        }
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingTop(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters padding to bottom
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pb6_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingBottom(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters padding to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pl6_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingLeft(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters padding to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper pr6_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setPaddingRight(6);
        }
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
     * @param size in millimeters to apply to top padding
     * @return the component with the applied styling to all states
     */
    public Helper pt_(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to top
     *
     * @param size in millimeters to apply to top padding
     * @return the component with the applied styling to all states
     */
    public Helper pt_(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to bottom
     *
     * @param size in millimeters to apply to bottom padding
     * @return the component with the applied styling to all states
     */
    public Helper pb_(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to bottom
     *
     * @param size in millimeters to apply to bottom padding
     * @return the component with the applied styling to all states
     */
    public Helper pb_(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to left
     *
     * @param size in millimeters to apply to left padding
     * @return the component with the applied styling to all states
     */
    public Helper pl_(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to left
     *
     * @param size in millimeters to apply to left padding
     * @return the component with the applied styling to all states
     */
    public Helper pl_(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to right
     *
     * @param size in millimeters to apply to right padding
     * @return the component with the applied styling to all states
     */
    public Helper pr_(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to right
     *
     * @param size in millimeters to apply to right padding
     * @return the component with the applied styling to all states
     */
    public Helper pr_(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to left and right
     *
     * @param size in millimeters to apply to left and right paddings
     * @return the component with the applied styling to all states
     */
    public Helper px_(int size) {
        pl_(size);
        pr_(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to left and right
     *
     * @param size in millimeters to apply to left and right paddings
     * @return the component with the applied styling to all states
     */
    public Helper px_(float size) {
        pl_(size);
        pr_(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top and bottom
     *
     * @param size in millimeters to apply to top and bottom paddings
     * @return the component with the applied styling to all states
     */
    public Helper py_(int size) {
        pt_(size);
        pb_(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top and bottom
     *
     * @param size in millimeters to apply to top and bottom paddings
     * @return the component with the applied styling to all states
     */
    public Helper py_(float size) {
        pt_(size);
        pb_(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top, bottom, left and right
     *
     * @param size in millimeters to apply to all paddings
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
     * Applies custom millimeters padding to top, bottom, left and right
     *
     * @param size in millimeters to apply to all paddings
     * @return the component with the applied styling to all states
     */
    public Helper pa_(float size) {
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
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(color);
        }
        return this;
    }

    /**
     * Mute a text to look disabled
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textMuted_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x818a91);
        }
        return this;
    }

    /**
     * Primary text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textPrimary_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x145F80);
        }
        return this;
    }

    /**
     * Success text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textSuccess_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x5cb85c);
        }
        return this;
    }

    /**
     * Info text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textInfo_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x5bc0de);
        }
        return this;
    }

    /**
     * Warning text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textWarning_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xf0ad4e);
        }
        return this;
    }

    /**
     * Danger text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textDanger_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xd9534f);
        }
        return this;
    }

    /**
     * Red text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textRed_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xf44336);
        }
        return this;
    }

    /**
     * Pink text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textPink_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xe91e63);
        }
        return this;
    }

    /**
     * Purple text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textPurple_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x9c27b0);
        }
        return this;
    }

    /**
     * Deep purple text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textDeepPurple_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x673ab7);
        }
        return this;
    }

    /**
     * Indigo text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textIndigo_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x3f51b5);
        }
        return this;
    }

    /**
     * Blue text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBlue_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x2196F3);
        }
        return this;
    }

    /**
     * Light blue text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLightBlue_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x03a9f4);
        }
        return this;
    }

    /**
     * Cyan text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textCyan_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x00bcd4);
        }
        return this;
    }

    /**
     * Teal text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textTeal_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x009688);
        }
        return this;
    }

    /**
     * Green text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textGreen_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x4caf50);
        }
        return this;
    }

    /**
     * Light green text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLightGreen_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x8bc34a);
        }
        return this;
    }

    /**
     * Lime text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLime_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xcddc39);
        }
        return this;
    }

    /**
     * Yellow text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textYellow_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xffeb3b);
        }
        return this;
    }

    /**
     * Amber text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textAmber_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xffc107);
        }
        return this;
    }

    /**
     * Orange text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textOrange_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xff9800);
        }
        return this;
    }

    /**
     * Deep orange text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textDeepOrange_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xff5722);
        }
        return this;
    }

    /**
     * Brown text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBrown_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x795548);
        }
        return this;
    }

    /**
     * Grey text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textGrey_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x9e9e9e);
        }
        return this;
    }

    /**
     * Blue-grey text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBlueGrey_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x607d8b);
        }
        return this;
    }

    /**
     * Black text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBlack_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0x000000);
        }
        return this;
    }

    /**
     * White text color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textWhite_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setFgColor(0xffffff);
        }
        return this;
    }

    /**
     * Apply a custom background color
     *
     * @param color int color to apply to background
     * @return the component with the applied styling to unselected state
     */
    public Helper bgColor_(int color) {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(color);
        }
        return this;
    }

    /**
     * Apply a custom background color
     *
     * @param color int color to apply to background
     * @return the component with the applied styling to pressed state
     */
    public Helper bgColor___(int color) {
        for (Component c : cmps) {
            c.getPressedStyle().setBgTransparency(this.bg_trans);
            c.getPressedStyle().setBgColor(color);
        }
        return this;
    }

    /**
     * Apply a custom background color
     *
     * @param color int color to apply to background
     * @return the component with the applied styling to disabled state
     */
    public Helper bgColor____(int color) {
        for (Component c : cmps) {
            c.getDisabledStyle().setBgTransparency(this.bg_trans);
            c.getDisabledStyle().setBgColor(color);
        }
        return this;
    }

    /**
     * Mute a text to look disabled
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgMuted_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x818a91);
        }
        return this;
    }

    /**
     * Primary background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgPrimary_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x145F80);
        }
        return this;
    }

    /**
     * Success background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgSuccess_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x5cb85c);
        }
        return this;
    }

    /**
     * Info background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgInfo_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x5bc0de);
        }
        return this;
    }

    /**
     * Warning background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgWarning_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xf0ad4e);
        }
        return this;
    }

    /**
     * Danger background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgDanger_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xd9534f);
        }
        return this;
    }

    /**
     * Red background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgRed_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xf44336);
        }
        return this;
    }

    /**
     * Pink background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgPink_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xe91e63);
        }
        return this;
    }

    /**
     * Purple background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgPurple_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x9c27b0);
        }
        return this;
    }

    /**
     * Deep purple background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgDeepPurple_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x673ab7);
        }
        return this;
    }

    /**
     * Indigo background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgIndigo_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x3f51b5);
        }
        return this;
    }

    /**
     * Blue background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBlue_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x2196F3);
        }
        return this;
    }

    /**
     * Light blue background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLightBlue_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x03a9f4);
        }
        return this;
    }

    /**
     * Cyan background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgCyan_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x00bcd4);
        }
        return this;
    }

    /**
     * Teal background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgTeal_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x009688);
        }
        return this;
    }

    /**
     * Green background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgGreen_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x4caf50);
        }
        return this;
    }

    /**
     * Light green background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLightGreen_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x8bc34a);
        }
        return this;
    }

    /**
     * Lime background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLime_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xcddc39);
        }
        return this;
    }

    /**
     * Yellow background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgYellow_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xffeb3b);
        }
        return this;
    }

    /**
     * Amber background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgAmber_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xffc107);
        }
        return this;
    }

    /**
     * Orange background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgOrange_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xff9800);
        }
        return this;
    }

    /**
     * Deep orange background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgDeepOrange_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xff5722);
        }
        return this;
    }

    /**
     * Brown background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBrown_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x795548);
        }
        return this;
    }

    /**
     * Grey background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgGrey_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x9e9e9e);
        }
        return this;
    }

    /**
     * Light-grey background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgLightGrey_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xebebeb);
        }
        return this;
    }

    /**
     * Blue-grey background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBlueGrey_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x607d8b);
        }
        return this;
    }

    /**
     * Black background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgBlack_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0x000000);
        }
        return this;
    }

    /**
     * White background color
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper bgWhite_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setBgTransparency(this.bg_trans);
            c.getUnselectedStyle().setBgColor(0xffffff);
        }
        return this;
    }

    /**
     * Applies small size to text
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textSmall_() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainRegular", "native:MainRegular");
            font.derive(Font.SIZE_SMALL, Font.STYLE_PLAIN);
            c.getUnselectedStyle().setFont(font);
        }
        return this;
    }

    /**
     * Applies medium size to text
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textMedium_() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainRegular", "native:MainRegular");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_PLAIN);
            c.getUnselectedStyle().setFont(font);
        }
        return this;
    }

    /**
     * Applies large size to text
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLarge_() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainRegular", "native:MainRegular");
            font.derive(Font.SIZE_LARGE, Font.STYLE_PLAIN);
            c.getUnselectedStyle().setFont(font);
        }
        return this;
    }

    /**
     * Makes text bold
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textBold_() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainBold", "native:MainBold");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_BOLD);
            c.getUnselectedStyle().setFont(font);
        }
        return this;
    }

    /**
     * Makes text light
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLight_() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainLight", "native:MainLight");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_PLAIN);
            c.getUnselectedStyle().setFont(font);
        }
        return this;
    }

    /**
     * Makes text italic
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textItalic_() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:ItalicRegular", "native:ItalicRegular");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_ITALIC);
            c.getUnselectedStyle().setFont(font);
        }
        return this;
    }

    /**
     * Align text to left
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textLeft_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setAlignment(Component.LEFT);
        }
        return this;
    }

    /**
     * Align text to right
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textRight_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setAlignment(Component.RIGHT);
        }
        return this;
    }

    /**
     * Align text to center
     *
     * @return the component with the applied styling to unselected state
     */
    public Helper textCenter_() {
        for (Component c : cmps) {
            c.getUnselectedStyle().setAlignment(Component.CENTER);
        }
        return this;
    }

    /**
     * THIS SECTION APPLIES STYLING TO ALL STATES
     */
    /**
     * Set maximum width the component should never exceed
     *
     * @param width the maximum width in pixel
     * @return the component with the applied styling to unselected state
     */
    public Helper maxWidth(int width) {
        for (Component c : cmps) {
            if (c.getPreferredW() > width) {
                c.setPreferredW(width);
            }
        }
        return this;
    }

    /**
     * Set maximum height the component should never exceed
     *
     * @param height the maximum height in pixel
     * @return the component with the applied styling to unselected state
     */
    public Helper maxHeight(int height) {
        for (Component c : cmps) {
            if (c.getPreferredH() > height) {
                c.setPreferredH(height);
            }
        }
        return this;
    }

    /**
     * Set minimum width the component should never exceed
     *
     * @param width the minimum width in pixel
     * @return the component with the applied styling to unselected state
     */
    public Helper minWidth(int width) {
        for (Component c : cmps) {
            if (c.getPreferredW() < width) {
                c.setPreferredW(width);
            }
        }
        return this;
    }

    /**
     * Set minimum height the component should never exceed
     *
     * @param height the minimum height in pixel
     * @return the component with the applied styling to unselected state
     */
    public Helper minHeight(int height) {
        for (Component c : cmps) {
            if (c.getPreferredH() < height) {
                c.setPreferredH(height);
            }
        }
        return this;
    }

    /**
     * Applies 0 millimeters margin to top
     *
     * @return the component with the applied styling to all states
     */
    public Helper mt0() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb0() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml0() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr0() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(0);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb1() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml1() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr1() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(1);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb2() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml2() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr2() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(2);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb3() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml3() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr3() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(3);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb4() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml4() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr4() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(4);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb5() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml5() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr5() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(5);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters margin to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper mb6() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters margin to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper ml6() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters margin to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper mr6() {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(6);
        }
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
     * @param size in millimeters to apply to top margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mt(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to top
     *
     * @param size in millimeters to apply to top margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mt(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to bottom
     *
     * @param size in millimeters to apply to bottom margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mb(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to bottom
     *
     * @param size in millimeters to apply to bottom margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mb(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to left
     *
     * @param size in millimeters to apply to left margin
     * @return the component with the applied styling to unselected state
     */
    public Helper ml(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to left
     *
     * @param size in millimeters to apply to left margin
     * @return the component with the applied styling to unselected state
     */
    public Helper ml(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to right
     *
     * @param size in millimeters to apply to right margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mr(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to right
     *
     * @param size in millimeters to apply to right margin
     * @return the component with the applied styling to unselected state
     */
    public Helper mr(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setMarginRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters margin to left and right
     *
     * @param size in millimeters to apply to left and right margins
     * @return the component with the applied styling to unselected state
     */
    public Helper mx(int size) {
        ml(size);
        mr(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to left and right
     *
     * @param size in millimeters to apply to left and right margins
     * @return the component with the applied styling to unselected state
     */
    public Helper mx(float size) {
        ml(size);
        mr(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top and bottom
     *
     * @param size in millimeters to apply to top and bottom margins
     * @return the component with the applied styling to unselected state
     */
    public Helper my(int size) {
        mt(size);
        mb(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top and bottom
     *
     * @param size in millimeters to apply to top and bottom margins
     * @return the component with the applied styling to unselected state
     */
    public Helper my(float size) {
        mt(size);
        mb(size);
        return this;
    }

    /**
     * Applies custom millimeters margin to top, bottom, left and right
     *
     * @param size in millimeters to apply to all margins
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
     * Applies custom millimeters margin to top, bottom, left and right
     *
     * @param size in millimeters to apply to all margins
     * @return the component with the applied styling to unselected state
     */
    public Helper ma(float size) {
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
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb0() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl0() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(0);
        }
        return this;
    }

    /**
     * Applies 0 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr0() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(0);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb1() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl1() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(1);
        }
        return this;
    }

    /**
     * Applies 1 millimeter padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr1() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(1);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb2() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl2() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(2);
        }
        return this;
    }

    /**
     * Applies 2 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr2() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(2);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb3() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl3() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(3);
        }
        return this;
    }

    /**
     * Applies 3 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr3() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(3);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb4() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl4() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(4);
        }
        return this;
    }

    /**
     * Applies 4 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr4() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(4);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb5() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl5() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(5);
        }
        return this;
    }

    /**
     * Applies 5 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr5() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(5);
        }
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
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters padding to bottom
     *
     * @return the component with the applied styling to all states
     */
    public Helper pb6() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters padding to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper pl6() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(6);
        }
        return this;
    }

    /**
     * Applies 6 millimeters padding to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper pr6() {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(6);
        }
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
     * @param size in millimeters to apply to top padding
     * @return the component with the applied styling to all states
     */
    public Helper pt(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to top
     *
     * @param size in millimeters to apply to top padding
     * @return the component with the applied styling to all states
     */
    public Helper pt(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingTop(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to bottom
     *
     * @param size in millimeters to apply to bottom padding
     * @return the component with the applied styling to all states
     */
    public Helper pb(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to bottom
     *
     * @param size in millimeters to apply to bottom padding
     * @return the component with the applied styling to all states
     */
    public Helper pb(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingBottom(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to left
     *
     * @param size in millimeters to apply to left padding
     * @return the component with the applied styling to all states
     */
    public Helper pl(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to left
     *
     * @param size in millimeters to apply to left padding
     * @return the component with the applied styling to all states
     */
    public Helper pl(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingLeft(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to right
     *
     * @param size in millimeters to apply to right padding
     * @return the component with the applied styling to all states
     */
    public Helper pr(int size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to right
     *
     * @param size in millimeters to apply to right padding
     * @return the component with the applied styling to all states
     */
    public Helper pr(float size) {
        for (Component c : cmps) {
            c.getAllStyles().setPaddingRight(size);
        }
        return this;
    }

    /**
     * Applies custom millimeters padding to left and right
     *
     * @param size in millimeters to apply to left and right paddings
     * @return the component with the applied styling to all states
     */
    public Helper px(int size) {
        pl(size);
        pr(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to left and right
     *
     * @param size in millimeters to apply to left and right paddings
     * @return the component with the applied styling to all states
     */
    public Helper px(float size) {
        pl(size);
        pr(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top and bottom
     *
     * @param size in millimeters to apply to top and bottom paddings
     * @return the component with the applied styling to all states
     */
    public Helper py(int size) {
        pt(size);
        pb(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top and bottom
     *
     * @param size in millimeters to apply to top and bottom paddings
     * @return the component with the applied styling to all states
     */
    public Helper py(float size) {
        pt(size);
        pb(size);
        return this;
    }

    /**
     * Applies custom millimeters padding to top, bottom, left and right
     *
     * @param size in millimeters to apply to all paddings
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
     * Applies custom millimeters padding to top, bottom, left and right
     *
     * @param size in millimeters to apply to all paddings
     * @return the component with the applied styling to all states
     */
    public Helper pa(float size) {
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
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(color);
        }
        return this;
    }

    /**
     * Apply a custom text color
     *
     * @param color int color to apply to text
     * @return the component with the applied styling to pressed state
     */
    public Helper textColor___(int color) {
        for (Component c : cmps) {
            c.getPressedStyle().setFgColor(color);
        }
        return this;
    }

    /**
     * Apply a custom text color
     *
     * @param color int color to apply to text
     * @return the component with the applied styling to disabled state
     */
    public Helper textColor____(int color) {
        for (Component c : cmps) {
            c.getDisabledStyle().setFgColor(color);
        }
        return this;
    }

    /**
     * Mute a text to look disabled
     *
     * @return the component with the applied styling to all states
     */
    public Helper textMuted() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x818a91);
        }
        return this;
    }

    /**
     * Primary text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textPrimary() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x145F80);
        }
        return this;
    }

    /**
     * Success text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textSuccess() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x5cb85c);
        }
        return this;
    }

    /**
     * Info text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textInfo() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x5bc0de);
        }
        return this;
    }

    /**
     * Warning text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textWarning() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xf0ad4e);
        }
        return this;
    }

    /**
     * Danger text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textDanger() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xd9534f);
        }
        return this;
    }

    /**
     * Red text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textRed() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xf44336);
        }
        return this;
    }

    /**
     * Pink text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textPink() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xe91e63);
        }
        return this;
    }

    /**
     * Purple text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textPurple() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x9c27b0);
        }
        return this;
    }

    /**
     * Deep purple text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textDeepPurple() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x673ab7);
        }
        return this;
    }

    /**
     * Indigo text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textIndigo() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x3f51b5);
        }
        return this;
    }

    /**
     * Blue text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBlue() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x2196F3);
        }
        return this;
    }

    /**
     * Light blue text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLightBlue() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x03a9f4);
        }
        return this;
    }

    /**
     * Cyan text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textCyan() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x00bcd4);
        }
        return this;
    }

    /**
     * Teal text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textTeal() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x009688);
        }
        return this;
    }

    /**
     * Green text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textGreen() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x4caf50);
        }
        return this;
    }

    /**
     * Light green text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLightGreen() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x8bc34a);
        }
        return this;
    }

    /**
     * Lime text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLime() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xcddc39);
        }
        return this;
    }

    /**
     * Yellow text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textYellow() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xffeb3b);
        }
        return this;
    }

    /**
     * Amber text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textAmber() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xffc107);
        }
        return this;
    }

    /**
     * Orange text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textOrange() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xff9800);
        }
        return this;
    }

    /**
     * Deep orange text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textDeepOrange() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xff5722);
        }
        return this;
    }

    /**
     * Brown text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBrown() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x795548);
        }
        return this;
    }

    /**
     * Grey text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textGrey() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x9e9e9e);
        }
        return this;
    }

    /**
     * Blue-grey text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBlueGrey() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x607d8b);
        }
        return this;
    }

    /**
     * Black text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBlack() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0x000000);
        }
        return this;
    }

    /**
     * White text color
     *
     * @return the component with the applied styling to all states
     */
    public Helper textWhite() {
        for (Component c : cmps) {
            c.getAllStyles().setFgColor(0xffffff);
        }
        return this;
    }

    /**
     * Apply a custom background image that fills the background
     *
     * @param image Image to apply to background
     * @return the component with the applied styling to all states
     */
    public Helper bgImage(Image image) {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(0);
            c.getAllStyles().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED_FILL);
            c.getAllStyles().setBgImage(image);
        }
        return this;
    }

    /**
     * Apply a custom opacity
     *
     * @param opacity int opacity to apply to component
     * @return the component with the applied styling to all states
     */
    public Helper opacity(int opacity) {
        for (Component c : cmps) {
            if (opacity >= 0 && opacity <= 255) {
                c.getAllStyles().setOpacity(opacity);
            }
        }
        return this;
    }

    /**
     * Apply a custom background color
     *
     * @param color int color to apply to background
     * @return the component with the applied styling to all states
     */
    public Helper bgColor(int color) {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(color);
        }
        return this;
    }

    /**
     * Mute a background to look disabled
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgMuted() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x818a91);
        }
        return this;
    }

    /**
     * Primary background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgPrimary() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x145F80);
        }
        return this;
    }

    /**
     * Success background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgSuccess() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x5cb85c);
        }
        return this;
    }

    /**
     * Info background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgInfo() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x5bc0de);
        }
        return this;
    }

    /**
     * Warning background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgWarning() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xf0ad4e);
        }
        return this;
    }

    /**
     * Danger background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgDanger() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xd9534f);
        }
        return this;
    }

    /**
     * Red background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgRed() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xf44336);
        }
        return this;
    }

    /**
     * Pink background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgPink() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xe91e63);
        }
        return this;
    }

    /**
     * Purple background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgPurple() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x9c27b0);
        }
        return this;
    }

    /**
     * Deep purple background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgDeepPurple() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x673ab7);
        }
        return this;
    }

    /**
     * Indigo background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgIndigo() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x3f51b5);
        }
        return this;
    }

    /**
     * Blue background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBlue() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x2196F3);
        }
        return this;
    }

    /**
     * Light blue background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLightBlue() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x03a9f4);
        }
        return this;
    }

    /**
     * Cyan background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgCyan() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x00bcd4);
        }
        return this;
    }

    /**
     * Teal background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgTeal() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x009688);
        }
        return this;
    }

    /**
     * Green background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgGreen() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x4caf50);
        }
        return this;
    }

    /**
     * Light green background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLightGreen() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x8bc34a);
        }
        return this;
    }

    /**
     * Lime background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLime() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xcddc39);
        }
        return this;
    }

    /**
     * Yellow background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgYellow() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xffeb3b);
        }
        return this;
    }

    /**
     * Amber background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgAmber() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xffc107);
        }
        return this;
    }

    /**
     * Orange background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgOrange() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xff9800);
        }
        return this;
    }

    /**
     * Deep orange background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgDeepOrange() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xff5722);
        }
        return this;
    }

    /**
     * Brown background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBrown() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x795548);
        }
        return this;
    }

    /**
     * Grey background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgGrey() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x9e9e9e);
        }
        return this;
    }

    /**
     * Light-grey background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgLightGrey() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xebebeb);
        }
        return this;
    }

    /**
     * Blue-grey background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBlueGrey() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x607d8b);
        }
        return this;
    }

    /**
     * Black background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgBlack() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0x000000);
        }
        return this;
    }

    /**
     * White background color
     *
     * @return the component with the applied styling to all states
     */
    public Helper bgWhite() {
        for (Component c : cmps) {
            c.getAllStyles().setBgTransparency(this.bg_trans);
            c.getAllStyles().setBgColor(0xffffff);
        }
        return this;
    }

    /**
     * Applies small size to text
     *
     * @return the component with the applied styling to all states
     */
    public Helper textSmall() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainRegular", "native:MainRegular");
            font.derive(Font.SIZE_SMALL, Font.STYLE_PLAIN);
            c.getAllStyles().setFont(font);
        }
        return this;
    }

    /**
     * Applies medium size to text
     *
     * @return the component with the applied styling to all states
     */
    public Helper textMedium() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainRegular", "native:MainRegular");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_PLAIN);
            c.getAllStyles().setFont(font);
        }
        return this;
    }

    /**
     * Applies large size to text
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLarge() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainRegular", "native:MainRegular");
            font.derive(Font.SIZE_LARGE, Font.STYLE_PLAIN);
            c.getAllStyles().setFont(font);
        }
        return this;
    }

    /**
     * Makes text bold
     *
     * @return the component with the applied styling to all states
     */
    public Helper textBold() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainBold", "native:MainBold");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_BOLD);
            c.getAllStyles().setFont(font);
        }
        return this;
    }

    /**
     * Makes text light
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLight() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:MainLight", "native:MainLight");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_PLAIN);
            c.getAllStyles().setFont(font);
        }
        return this;
    }

    /**
     * Makes text italic
     *
     * @return the component with the applied styling to all states
     */
    public Helper textItalic() {
        for (Component c : cmps) {
            final Font font = Font.createTrueTypeFont("native:ItalicRegular", "native:ItalicRegular");
            font.derive(Font.SIZE_MEDIUM, Font.STYLE_ITALIC);
            c.getAllStyles().setFont(font);
        }
        return this;
    }

    /**
     * Align text to left
     *
     * @return the component with the applied styling to all states
     */
    public Helper textLeft() {
        for (Component c : cmps) {
            c.getAllStyles().setAlignment(Component.LEFT);
        }
        return this;
    }

    /**
     * Align text to right
     *
     * @return the component with the applied styling to all states
     */
    public Helper textRight() {
        for (Component c : cmps) {
            c.getAllStyles().setAlignment(Component.RIGHT);
        }
        return this;
    }

    /**
     * Align text to center
     *
     * @return the component with the applied styling to all states
     */
    public Helper textCenter() {
        for (Component c : cmps) {
            c.getAllStyles().setAlignment(Component.CENTER);
        }
        return this;
    }

    public Helper borderTop(int radius, Component... cmps) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(1).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(1).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(1).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(1).radius(radius));
        }
        return this;
    }

    public Helper borderBottom(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(2).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(2).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(2).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(2).radius(radius));
        }
        return this;
    }

    public Helper borderLeft(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(3).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(3).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(3).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(3).radius(radius));
        }
        return this;
    }

    public Helper borderRight(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(4).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(4).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(4).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(4).radius(radius));
        }
        return this;
    }

    public Helper borderAll(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius));
        }
        return this;
    }

    public Helper borderAllWithShadow(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius).shadowOpacity(20).shadowSpread(CN.convertToPixels(0.2f), false).shadowX(0.4f).shadowY(0.3f));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius).shadowOpacity(20).shadowSpread(CN.convertToPixels(0.2f), false).shadowX(0.4f).shadowY(0.3f));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius).shadowOpacity(20).shadowSpread(CN.convertToPixels(0.2f), false).shadowX(0.4f).shadowY(0.3f));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius).shadowOpacity(20).shadowSpread(CN.convertToPixels(0.2f), false).shadowX(0.4f).shadowY(0.3f));
        }
        return this;
    }

    public Helper borderTopLeft(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(5).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(5).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(5).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(5).radius(radius));
        }
        return this;
    }

    public Helper borderTopRight(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(6).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(6).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(6).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(6).radius(radius));
        }
        return this;
    }

    public Helper borderBottomLeft(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(7).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(7).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(7).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(7).radius(radius));
        }
        return this;
    }

    public Helper borderBottomRight(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(8).radius(radius));
            cmp.getSelectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getSelectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(8).radius(radius));
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(8).radius(radius));
            cmp.getDisabledStyle().setBorder(RoundedBorder.create().
                    color(cmp.getDisabledStyle().getBgColor()).
                    rectangle(false).roundedPosition(8).radius(radius));
        }
        return this;
    }

    public Helper borderTop_(int radius, Component... cmps) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(1).radius(radius));
        }
        return this;
    }

    public Helper borderBottom_(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(2).radius(radius));
        }
        return this;
    }

    public Helper borderLeft_(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(3).radius(radius));
        }
        return this;
    }

    public Helper borderRight_(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(4).radius(radius));
        }
        return this;
    }

    public Helper borderAll_(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius));
        }
        return this;
    }

    public Helper borderAllWithShadow_(int radius) {
        for (Component cmp : cmps) {
            cmp.getUnselectedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getUnselectedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius).shadowOpacity(20).shadowSpread(CN.convertToPixels(0.2f), false).shadowX(0.4f).shadowY(0.3f));
        }
        return this;
    }

    public Helper borderTop___(int radius, Component... cmps) {
        for (Component cmp : cmps) {
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(1).radius(radius));
        }
        return this;
    }

    public Helper borderBottom___(int radius) {
        for (Component cmp : cmps) {
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(2).radius(radius));
        }
        return this;
    }

    public Helper borderLeft___(int radius) {
        for (Component cmp : cmps) {
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(3).radius(radius));
        }
        return this;
    }

    public Helper borderRight___(int radius) {
        for (Component cmp : cmps) {
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(4).radius(radius));
        }
        return this;
    }

    public Helper borderAll___(int radius) {
        for (Component cmp : cmps) {
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius));
        }
        return this;
    }

    public Helper borderAllWithShadow___(int radius) {
        for (Component cmp : cmps) {
            cmp.getPressedStyle().setBorder(RoundedBorder.create().
                    color(cmp.getPressedStyle().getBgColor()).
                    rectangle(false).roundedPosition(-1).radius(radius).shadowOpacity(20).shadowSpread(CN.convertToPixels(0.2f), false).shadowX(0.4f).shadowY(0.3f));
        }
        return this;
    }
}
