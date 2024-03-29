/**
 * ***************************************************************************** Turnstone Biologics
 * Confidential
 *
 * <p>2018 Turnstone Biologics All Rights Reserved.
 *
 * <p>This file is subject to the terms and conditions defined in file 'license.txt', which is part
 * of this source code package.
 *
 * <p>Contributors : Turnstone Biologics - General Release
 * ****************************************************************************
 */
package com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.controller.command;

import com.occulue.api.*;
import com.occulue.command.*;
import com.occulue.controller.*;
import com.occulue.delegate.*;
import com.occulue.entity.*;
import com.occulue.exception.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.*;

/**
 * Implements Spring Controller command CQRS processing for entity IntegerProxy.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/IntegerProxy")
public class IntegerProxyCommandRestController extends BaseSpringRestController {

  /**
   * Handles create a IntegerProxy. if not key provided, calls create, otherwise calls save
   *
   * @param IntegerProxy integerProxy
   * @return CompletableFuture<UUID>
   */
  @PostMapping("/create")
  public CompletableFuture<UUID> create(
      @RequestBody(required = true) CreateIntegerProxyCommand command) {
    CompletableFuture<UUID> completableFuture = null;
    try {

      completableFuture =
          IntegerProxyBusinessDelegate.getIntegerProxyInstance().createIntegerProxy(command);
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, exc.getMessage(), exc);
    }

    return completableFuture;
  }

  /**
   * Handles updating a IntegerProxy. if no key provided, calls create, otherwise calls save
   *
   * @param IntegerProxy integerProxy
   * @return CompletableFuture<Void>
   */
  @PutMapping("/update")
  public CompletableFuture<Void> update(
      @RequestBody(required = true) UpdateIntegerProxyCommand command) {
    CompletableFuture<Void> completableFuture = null;
    try {
      // -----------------------------------------------
      // delegate the UpdateIntegerProxyCommand
      // -----------------------------------------------
      completableFuture =
          IntegerProxyBusinessDelegate.getIntegerProxyInstance().updateIntegerProxy(command);
      ;
    } catch (Throwable exc) {
      LOGGER.log(
          Level.WARNING,
          "IntegerProxyController:update() - successfully update IntegerProxy - "
              + exc.getMessage());
    }

    return completableFuture;
  }

  /**
   * Handles deleting a IntegerProxy entity
   *
   * @param command ${class.getDeleteCommandAlias()}
   * @return CompletableFuture<Void>
   */
  @DeleteMapping("/delete")
  public CompletableFuture<Void> delete(@RequestParam(required = true) UUID integerProxyId) {
    CompletableFuture<Void> completableFuture = null;
    DeleteIntegerProxyCommand command = new DeleteIntegerProxyCommand(integerProxyId);

    try {
      IntegerProxyBusinessDelegate delegate =
          IntegerProxyBusinessDelegate.getIntegerProxyInstance();

      completableFuture = delegate.delete(command);
      LOGGER.log(
          Level.WARNING,
          "Successfully deleted IntegerProxy with key " + command.getIntegerProxyId());
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, exc.getMessage());
    }

    return completableFuture;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected IntegerProxy integerProxy = null;
  private static final Logger LOGGER =
      Logger.getLogger(IntegerProxyCommandRestController.class.getName());
}
