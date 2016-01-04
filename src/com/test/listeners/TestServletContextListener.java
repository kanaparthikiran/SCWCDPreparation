package com.test.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.test.beans.AddressBean;

/**
 * Application Lifecycle Listener implementation class TestServletContextListener
 *
 */
//@WebListener
public class TestServletContextListener implements ServletContextListener, ServletContextAttributeListener, 
			HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, 
			ServletRequestListener, ServletRequestAttributeListener {

	public String className ="TestServletContextListener";

	/**
     * Default constructor. 
     */
    public TestServletContextListener() {
        // TODO Auto-generated constructor stub
    	System.out.println("constructor is STARTED"+className);
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent paramServletRequestEvent) {
        // TODO Auto-generated method stub
    	System.out.println(" requestDestroyed()"+className);

    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("attributeAdded() "+className+ "  "+
    					paramHttpSessionBindingEvent.getSession());

    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent paramServletContextEvent) {
        // TODO Auto-generated method stub
    	System.out.println("ServletContextEvent contextInitialized"+className);
    	
    	AddressBean abean = new AddressBean();
    	abean.setAddress1("65 rio main");abean.setCity("sanjose");abean.setState("CA");
    	paramServletContextEvent.getServletContext().setAttribute("listenerAddress", abean);
    	
    	System.out.println("AddressBean Added in Context Attribute"+className);

    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent paramHttpSessionEvent) {
        // TODO Auto-generated method stub
    	System.out.println("sessionDidActivate() "+className);
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
        // TODO Auto-generated method stub
    	System.out.println("HttpSessionBindingEvent-valueBound - ()"+className);

    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent paramServletContextAttributeEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("ServletContextAttributeEvent-attributeAdded() "+className);

    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent paramServletContextAttributeEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("ServletContextAttributeEvent-attributeRemoved() "+className);

    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent paramHttpSessionEvent) {
        // TODO Auto-generated method stub
    	System.out.println("HttpSessionEvent-sessionDestroyed()"+className);

    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("HttpSessionBindingEvent-attributeRemoved() "+className);

    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent paramServletRequestAttributeEvent) {
        // TODO Auto-generated method stub
    	System.out.println("ServletRequestAttributeEvent-attributeAdded() "+className);

    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("HttpSessionBindingEvent-valueUnbound() "+className);

    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent paramHttpSessionEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("HttpSessionEvent - sessionWillPassivate() "+className);

    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent paramHttpSessionEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("HttpSessionEvent  sessionCreated() "+className);

    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("HttpSessionBindingEvent  attributeReplaced() "+className);

    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent paramServletContextAttributeEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("ServletContextAttributeEvent  attributeReplaced() "+className);

    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent paramServletRequestAttributeEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("ServletRequestAttributeEvent  attributeRemoved() "+className);

    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent paramServletContextEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("ServletContextEvent is contextDestroyed()"+className);

    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent paramServletRequestAttributeEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("ServletRequestAttributeEvent  attributeReplaced() "+className);

    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent paramServletRequestEvent) {
        // TODO Auto-generated method stub
    	
    	System.out.println("ServletRequestEvent requestInitialized()"+className);

    }
	
}
