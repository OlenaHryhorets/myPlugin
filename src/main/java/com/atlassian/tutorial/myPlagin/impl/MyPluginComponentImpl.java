package com.atlassian.tutorial.myPlagin.impl;

//import com.atlassian.sal.api.ApplicationProperties;
import com.atlassian.jira.config.properties.ApplicationProperties;
import com.atlassian.tutorial.myPlagin.api.MyPluginComponent;


public class MyPluginComponentImpl implements MyPluginComponent
{
        private final ApplicationProperties applicationProperties;

        public MyPluginComponentImpl(final ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "myComponent: LenaComponent";
        }
        
        return "myComponent";
    }
}
