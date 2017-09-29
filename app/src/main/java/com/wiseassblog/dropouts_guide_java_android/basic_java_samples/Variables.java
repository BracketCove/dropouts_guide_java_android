package com.wiseassblog.dropouts_guide_java_android.basic_java_samples;

/**
 * Variables. You may also hear the term "Field" thrown around; which is a synonym.
 *
 * Variables are pieces and/or collections of Data which our Apps require at Runtime to manipulate
 * and read.
 * Created by R_KAY on 9/26/2017.
 */

public class Variables {

     /*
    Keywords such as private, static, final, etc. are more that just ways to
    configure your Classes and Variables. They also help anyone reading the code to understand
    the intention of the various parts of an App; and help your IDE with compile time checking of
    your code. You can worry less about reading code and more about solving problems, this way.
    */

    //Most Variables should be private and accessed with Getter/Setters if they need to be accessed
    //at all.

    /*
    E.G. 1
    A PDF Reader App might want to store which Page the User is currently on.
     */
    private int pageNumber;

    /*
     E.G. 2
    In Android, you'll often have to create both a kind of "Key" or constant name, and a 'Value'
    (like "pageNumber"), when storing and sending Data temporarily. Since changing this Key after a value
    is stored would mean not being able to access that value, it makes sense to write it as final
    and static. "final static" essentially means "this variable will never change in value", among
    other more technical considerations.
    */
    private final static String USER_PAGE_NUMBER = "USER_PAGE_NUMBER";

    /*
    E.G. 3
    In this case, final means the value doesn't need to be the same always, but it doesn't change
    after it is first initialized.

    This makes sense for things like the Id of a user within a Database. If you look at this Code
    within AS, you'll notice that it shows up red. This helps one to not forget to initialize the
    value.
     */
    private final String userId;

}
