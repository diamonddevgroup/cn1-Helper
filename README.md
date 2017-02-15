# cn1-Helper
A Helper library for basic styling using code in Codename One. This eliminates the need to have endless UIID in your GUI builder

Download  [Helper.cn1Lib][1] to the **Lib** folder of your project.
Go to your project and do **Refresh cn1Lib files**.
Call `new Helper(myCmp)` only AFTER `setUIID()` method and not BEFORE.

# JavaDoc

View the project JavaDoc [here][2].

# Usage example

 **Basic styling of a single component**
 
     Label myLabel = new Label("Test Label");
     new Helper(myLabel).pa1().ma0().textGreen().bgColor(0xe1e1e1);
    
**Style a single component with custom Unit**

    Label myLabel = new Label("Test Label");
    new Helper(myLabel, , Style.UNIT_TYPE_PIXELS).pa1().ma0().textGreen().bgColor(0xe1e1e1);
    
**Apply same style to multiple unrelated components, individual styles could still be applied**

    Button myButton = new Button("Test Button 1");
    Label myLabel = new Label("Test Label");
    SpanLabel mySpanLabel = new SpanLabel("Test SpanLabel");
    new Helper(myButton, myLabel, mySpanLabel.getComponentAt(1)).pa1().ma0().textGreen().bgColor(0xe1e1e1);

# Contribution 

You are welcome to add more styling. Fork the project and commit your code.
You can also improve the documentation, methods and classes used.

  [1]: https://github.com/diamondobama/cn1-Helper/blob/master/Helper.cn1lib?raw=true
  [2]: https://diamondobama.github.io/apidocs/cn1-helper/
