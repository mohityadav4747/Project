package com.app;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class <?> [] getRootConfigClasses() {
        return new Class[] {
            AppContext.class
        };
        //return null;
    }

    @Override
    protected Class <?> [] getServletConfigClasses() {
        return new Class[] {
            AppConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }
}