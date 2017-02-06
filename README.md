# cn1-Helper
A Helper library for basic styling using code in Codename One. This eliminates the to have endless endless UIID in your GUI builder

Download  [Helper.cn1Lib][1] to the **Lib** folder of your project.
Go to your project and do **Refresh cn1Lib files**.

# Example usage

    /*Style a single component*/
    Label myLabel = new Label("Test Label");
    new Helper(myLabel).pa1().ma0().textGreen().bgColor(0xe1e1e1);
    
    /*Style a single component with custom Unit*/
    Label myLabel = new Label("Test Label");
    new Helper(myLabel, , Style.UNIT_TYPE_PIXELS).pa1().ma0().textGreen().bgColor(0xe1e1e1);
    
    /*Same style to multiple components*/
    Button myButton = new Button("Test Button 1");
    Label myLabel = new Label("Test Label");
    SpanLabel mySpanLabel = new SpanLabel("Test SpanLabel");
    new Helper(myButton, myLabel, mySpanLabel.getComponentAt(1)).pa1().ma0().textGreen().bgColor(0xe1e1e1);


  [1]: https://github.com/diamondobama/cn1-Helper/blob/master/Helper.cn1lib?raw=true
