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
package com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.delegate;

import com.occulue.api.*;
import com.occulue.delegate.*;
import com.occulue.entity.*;
import com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.validator.*;
import com.occulue.exception.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.QueryUpdateEmitter;

/**
 * AngleDegrees business delegate class.
 *
 * <p>This class implements the Business Delegate design pattern for the purpose of:
 *
 * <ol>
 *   <li>Reducing coupling between the business tier and a client of the business tier by hiding all
 *       business-tier implementation details
 *   <li>Improving the available of AngleDegrees related services in the case of a AngleDegrees
 *       business related service failing.
 *   <li>Exposes a simpler, uniform AngleDegrees interface to the business tier, making it easy for
 *       clients to consume a simple Java object.
 *   <li>Hides the communication protocol that may be required to fulfill AngleDegrees business
 *       related services.
 * </ol>
 *
 * <p>
 *
 * @author your_name_here
 */
public class AngleDegreesBusinessDelegate extends BaseBusinessDelegate {
  // ************************************************************************
  // Public Methods
  // ************************************************************************
  /** Default Constructor */
  public AngleDegreesBusinessDelegate() {
    queryGateway = applicationContext.getBean(QueryGateway.class);
    commandGateway = applicationContext.getBean(CommandGateway.class);
    queryUpdateEmitter = applicationContext.getBean(QueryUpdateEmitter.class);
  }

  /**
   * AngleDegrees Business Delegate Factory Method
   *
   * <p>All methods are expected to be self-sufficient.
   *
   * @return AngleDegreesBusinessDelegate
   */
  public static AngleDegreesBusinessDelegate getAngleDegreesInstance() {
    return (new AngleDegreesBusinessDelegate());
  }

  /**
   * Creates the provided command.
   *
   * @param command ${class.getCreateCommandAlias()}
   * @exception ProcessingException
   * @exception IllegalArgumentException
   * @return CompletableFuture<UUID>
   */
  public CompletableFuture<UUID> createAngleDegrees(CreateAngleDegreesCommand command)
      throws ProcessingException, IllegalArgumentException {

    CompletableFuture<UUID> completableFuture = null;

    try {
      // --------------------------------------
      // assign identity now if none
      // --------------------------------------
      if (command.getAngleDegreesId() == null) command.setAngleDegreesId(UUID.randomUUID());

      // --------------------------------------
      // validate the command
      // --------------------------------------
      AngleDegreesValidator.getInstance().validate(command);

      // ---------------------------------------
      // issue the CreateAngleDegreesCommand - by convention the future return value for a create
      // command
      // that is handled by the constructor of an aggregate will return the UUID
      // ---------------------------------------
      completableFuture = commandGateway.send(command);

      LOGGER.log(
          Level.INFO,
          "return from Command Gateway for CreateAngleDegreesCommand of AngleDegrees is "
              + command);

    } catch (Exception exc) {
      final String errMsg = "Unable to create AngleDegrees - " + exc;
      LOGGER.log(Level.WARNING, errMsg, exc);
      throw new ProcessingException(errMsg, exc);
    } finally {
    }

    return completableFuture;
  }

  /**
   * Update the provided command.
   *
   * @param command UpdateAngleDegreesCommand
   * @return CompletableFuture<Void>
   * @exception ProcessingException
   * @exception IllegalArgumentException
   */
  public CompletableFuture<Void> updateAngleDegrees(UpdateAngleDegreesCommand command)
      throws ProcessingException, IllegalArgumentException {
    CompletableFuture<Void> completableFuture = null;

    try {

      // --------------------------------------
      // validate
      // --------------------------------------
      AngleDegreesValidator.getInstance().validate(command);

      // --------------------------------------
      // issue the UpdateAngleDegreesCommand and return right away
      // --------------------------------------
      completableFuture = commandGateway.send(command);
    } catch (Exception exc) {
      final String errMsg = "Unable to save AngleDegrees - " + exc;
      LOGGER.log(Level.WARNING, errMsg, exc);
      throw new ProcessingException(errMsg, exc);
    }

    return completableFuture;
  }

  /**
   * Deletes the associatied value object
   *
   * @param command DeleteAngleDegreesCommand
   * @return CompletableFuture<Void>
   * @exception ProcessingException
   */
  public CompletableFuture<Void> delete(DeleteAngleDegreesCommand command)
      throws ProcessingException, IllegalArgumentException {

    CompletableFuture<Void> completableFuture = null;

    try {
      // --------------------------------------
      // validate the command
      // --------------------------------------
      AngleDegreesValidator.getInstance().validate(command);

      // --------------------------------------
      // issue the DeleteAngleDegreesCommand and return right away
      // --------------------------------------
      completableFuture = commandGateway.send(command);
    } catch (Exception exc) {
      final String errMsg =
          "Unable to delete AngleDegrees using Id = " + command.getAngleDegreesId();
      LOGGER.log(Level.WARNING, errMsg, exc);
      throw new ProcessingException(errMsg, exc);
    } finally {
    }

    return completableFuture;
  }

  /**
   * Method to retrieve the AngleDegrees via AngleDegreesFetchOneSummary
   *
   * @param summary AngleDegreesFetchOneSummary
   * @return AngleDegreesFetchOneResponse
   * @exception ProcessingException - Thrown if processing any related problems
   * @exception IllegalArgumentException
   */
  public AngleDegrees getAngleDegrees(AngleDegreesFetchOneSummary summary)
      throws ProcessingException, IllegalArgumentException {

    if (summary == null)
      throw new IllegalArgumentException("AngleDegreesFetchOneSummary arg cannot be null");

    AngleDegrees entity = null;

    try {
      // --------------------------------------
      // validate the fetch one summary
      // --------------------------------------
      AngleDegreesValidator.getInstance().validate(summary);

      // --------------------------------------
      // use queryGateway to send request to Find a AngleDegrees
      // --------------------------------------
      CompletableFuture<AngleDegrees> futureEntity =
          queryGateway.query(
              new FindAngleDegreesQuery(new LoadAngleDegreesFilter(summary.getAngleDegreesId())),
              ResponseTypes.instanceOf(AngleDegrees.class));

      entity = futureEntity.get();
    } catch (Exception exc) {
      final String errMsg = "Unable to locate AngleDegrees with id " + summary.getAngleDegreesId();
      LOGGER.log(Level.WARNING, errMsg, exc);
      throw new ProcessingException(errMsg, exc);
    } finally {
    }

    return entity;
  }

  /**
   * Method to retrieve a collection of all AngleDegreess
   *
   * @return List<AngleDegrees>
   * @exception ProcessingException Thrown if any problems
   */
  public List<AngleDegrees> getAllAngleDegrees() throws ProcessingException {
    List<AngleDegrees> list = null;

    try {
      CompletableFuture<List<AngleDegrees>> futureList =
          queryGateway.query(
              new FindAllAngleDegreesQuery(),
              ResponseTypes.multipleInstancesOf(AngleDegrees.class));

      list = futureList.get();
    } catch (Exception exc) {
      String errMsg = "Failed to get all AngleDegrees";
      LOGGER.log(Level.WARNING, errMsg, exc);
      throw new ProcessingException(errMsg, exc);
    } finally {
    }

    return list;
  }

  /**
   * assign Value on AngleDegrees
   *
   * @param command AssignValueToAngleDegreesCommand
   * @exception ProcessingException
   */
  public void assignValue(AssignValueToAngleDegreesCommand command) throws ProcessingException {

    // --------------------------------------------
    // load the parent
    // --------------------------------------------
    load(command.getAngleDegreesId());

    com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.delegate
            .FloatProxyBusinessDelegate
        childDelegate =
            com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.delegate
                .FloatProxyBusinessDelegate.getFloatProxyInstance();
    AngleDegreesBusinessDelegate parentDelegate =
        AngleDegreesBusinessDelegate.getAngleDegreesInstance();
    UUID childId = command.getAssignment().getFloatProxyId();
    FloatProxy child = null;

    try {
      // --------------------------------------
      // best to validate the command now
      // --------------------------------------
      AngleDegreesValidator.getInstance().validate(command);

      // --------------------------------------
      // issue the command
      // --------------------------------------
      commandGateway.sendAndWait(command);

    } catch (Throwable exc) {
      final String msg = "Failed to get FloatProxy using id " + childId;
      LOGGER.log(Level.WARNING, msg);
      throw new ProcessingException(msg, exc);
    }
  }

  /**
   * unAssign Value on AngleDegrees
   *
   * @param command UnAssignValueFromAngleDegreesCommand
   * @exception ProcessingException
   */
  public void unAssignValue(UnAssignValueFromAngleDegreesCommand command)
      throws ProcessingException {

    try {
      // --------------------------------------
      // validate the command
      // --------------------------------------
      AngleDegreesValidator.getInstance().validate(command);

      // --------------------------------------
      // issue the command
      // --------------------------------------
      commandGateway.sendAndWait(command);
    } catch (Exception exc) {
      final String msg = "Failed to unassign Value on AngleDegrees";
      LOGGER.log(Level.WARNING, msg, exc);
      throw new ProcessingException(msg, exc);
    }
  }

  /**
   * Internal helper method to load the root
   *
   * @param id UUID
   * @return AngleDegrees
   */
  private AngleDegrees load(UUID id) throws ProcessingException {
    angleDegrees =
        AngleDegreesBusinessDelegate.getAngleDegreesInstance()
            .getAngleDegrees(new AngleDegreesFetchOneSummary(id));
    return angleDegrees;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  private final QueryGateway queryGateway;
  private final CommandGateway commandGateway;
  private final QueryUpdateEmitter queryUpdateEmitter;
  private AngleDegrees angleDegrees = null;
  private static final Logger LOGGER =
      Logger.getLogger(AngleDegreesBusinessDelegate.class.getName());
}