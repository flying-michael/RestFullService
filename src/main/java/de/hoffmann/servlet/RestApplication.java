/*
 *
 * $RCSfile:  $
 * $Revision: $
 *
 * $Author:  $
 * $Date:  $
 *
 */
package de.hoffmann.servlet;

import com.sun.jersey.api.core.PackagesResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author Michael Hoffmann (michael.hoffmann@1und1.de)
 *         <p/>
 *         Copyright (c) 2012 1&1 Mail & Media GmbH. All rights reserved.
 *         <p/>
 *         JavaDoc ....
 */
@ApplicationPath("/api/*")
public class RestApplication extends PackagesResourceConfig {

  public RestApplication() {
    super("de.hoffmann.rest");
  }


}
