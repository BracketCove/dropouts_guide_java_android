package com.wiseassblog.dropouts_guide_java_android.basic_java_samples;

/**
 * Methods are the way that we actually 'do' things within an App. They are often called Functions
 * as well; as they are very similar to Mathematical Functions.
 * <p>
 * <p>
 * Created by R_KAY on 9/26/2017.
 */

public class Methods {

    private String userName = "John Doe";

    /*
    E.G. 1
    One of the most common kinds of Methods you'll write, are Getter and Setter Methods.
    All they do is provide a way for other parts of the App to Read and Write Values when
    necessary.
     */

    //I've added linebreaks to the following method to help you understand each word.
    //You wouldn't normally write code this ugly!
    public //public: This means that external parts of the App can see and use this method

    String //Return Type: This means that the method MUST return a Variable of Type String

    getUserName() //Method Name: This is what an external part of the App would 'call'
    //in order to use this method. Notice the Camel case and small case first letter.

    {//Within these Brackets is the Code for a given method. In this case, we simply return
        //whatever the value of userName is; which would be "John Doe".
        return userName; //return means we are done computing the method, and indicates which value
        //to give the part of the App which initially called this method
    }


    /*
    E.G. 2

    Methods may receive Parameters (a.k.a. Arguments) within the Paranthesis that follow the Method
    Name. The following example is more like a method should look.

     Whichever part of the App that calls this method, must provide a String value in order to call
     it successfully. Such a call might look like:
     className.setUserName("Jane Smith");

     Also notice that since our Method just sets a value but doesn't need to return anything, our
     return type is 'void'.
     */

    public void setUserName(String userName) {
        /*The code below may seem confusing at first. What we are saying is:
        Make this.userName equal to userName (which was a value we passed in).

        I'll discuss the 'this' keyword later
         */
        this.userName = userName;
    }


}
