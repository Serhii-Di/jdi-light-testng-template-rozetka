package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.complex.table.Table;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;

@Url("/performance.html")
public class JDIPerformancePage extends WebPage {
    // @UI("#users-table")
    public static Table usersTable;

    // @UI("#user-names")
    public static Dropdown userNames;

    //@UI("#textarea-performance")
    public static TextArea textareaPerformance;
}
