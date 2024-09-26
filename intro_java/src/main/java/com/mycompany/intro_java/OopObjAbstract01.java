/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 * This code shows two examples of polymorphism:
 *      Method overriding.
 *      Method overloading.
 * 
 * 
 * Use:
 * 
 */


package com.mycompany.intro_java;


abstract class TemplateService {
    abstract void runService(); //abstract definition
    abstract void stopService();
    abstract void statusService();
    abstract void versionService();    
}

class ServiceLinux extends TemplateService {
    void runService() {
        // implementation of the service
        String s="s";
        System.out.println("ServiceLinux - runService()");
    }
    
    void stopService() {
        // implementation of the service
        System.out.println("ServiceLinux - stopService()");
    }

    void statusService() {
        // implementation of the service
        System.out.println("ServiceLinux - statusService()");
    }

    void versionService() {
        // implementation of the service
        System.out.println("ServiceLinux - versionService()");
    }    
}


class ServiceWindows extends TemplateService {
    void runService() {
        // implementation of the service
        String s="s";
        System.out.println("ServiceWindows - runService()");
    }
    
    void stopService() {
        // implementation of the service
        System.out.println("ServiceWindows - stopService()");
    }

    void statusService() {
        /* NADA */
        // implementation of the service
        System.out.println("ServiceWindows - statusService()");
    }

    void versionService() {
        // implementation of the service
        System.out.println("ServiceWindows - versionService()");
    }    
}

public class OopObjAbstract01 {
    public static void main(String[] args) {
        // -------------------------------------------------
        // Polymorphism Example 01 - Override
        // --------------------------------------------------
        ServiceLinux serviceLinux = new ServiceLinux();
        ServiceWindows serviceWindows = new ServiceWindows();
        
        serviceLinux.runService();
        serviceLinux.statusService();
        serviceLinux.stopService();

        serviceWindows.runService();
        serviceWindows.statusService();
        serviceWindows.stopService();
        
        
        // ---------------------------------        
    }
}