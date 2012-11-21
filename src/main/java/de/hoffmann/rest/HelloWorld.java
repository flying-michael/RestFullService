/*
 *
 * $RCSfile:  $
 * $Revision: $
 *
 * $Author:  $
 * $Date:  $
 *
 */
package de.hoffmann.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Michael Hoffmann (michael.hoffmann@1und1.de)
 *         <p/>
 *         Copyright (c) 2012 1&1 Mail & Media GmbH. All rights reserved.
 *         <p/>
 *         JavaDoc ....
 */
@Path("/notes")
@Produces({"text/plain"})
public class HelloWorld {

  @GET
  public String sayHello(){
    return "Hello World, I still need some work to be useful!";
  }


}
