package LoginWindow;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GBC extends GridBagConstraints {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs with a given gridx and gridy position and other value set to default
     * @param gridx the gridx position
     * @param gridy the gridy position
     */
    public GBC(int gridx, int gridy) 
    {
        this.gridx = gridx;
        this.gridy = gridy;
    }
    
    /**
     * Constructs with gridx, gridy, gridwidth, gridheight and other set to default
     * @param gridx the gridx position
     * @param gridy the gridy position
     * @param gridwidth the cell span in x-direction
     * @param gridheight the cell span in y-direction
     */
    public GBC(int gridx, int gridy, int gridwidth, int gridheight)
    {
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridwidth;
        this.gridheight = gridheight;
    }
    
    /**
     * Sets the Anchor Value
     */
    public GBC setAnchor(int anchor) 
    {
        this.anchor = anchor;
        return this;
    }
    
    /**
     * sets the fill direction
     */
    public GBC setFill(int fill)
    {
        this.fill = fill;
        return this;
    }
    
    /**
     * sets the padding
     */
    public GBC setIpad(int ipadx, int ipady)
    {
        this.ipadx = ipadx;
        this.ipady = ipady;
        return this;
    }
    
    /**
     * sets the insets
     */
    public GBC setInsets(int top, int left, int bottom, int right)
    {
        this.insets = new Insets(top, left, bottom, right);
        return this;
    }
}
