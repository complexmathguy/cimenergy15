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
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.userdefinedmodels.projector;

import com.occulue.api.*;
import com.occulue.entity.*;
import com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.userdefinedmodels.repository.*;
import com.occulue.exception.*;
import java.util.*;
import java.util.logging.Logger;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.axonframework.queryhandling.QueryUpdateEmitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Projector for MechanicalLoadUserDefined as outlined for the CQRS pattern. All event handling and
 * query handling related to MechanicalLoadUserDefined are invoked here and dispersed as an event to
 * be handled elsewhere.
 *
 * <p>Commands are handled by MechanicalLoadUserDefinedAggregate
 *
 * @author your_name_here
 */
// @ProcessingGroup("mechanicalLoadUserDefined")
@Component("mechanicalLoadUserDefined-projector")
public class MechanicalLoadUserDefinedProjector extends MechanicalLoadUserDefinedEntityProjector {

  // core constructor
  public MechanicalLoadUserDefinedProjector(
      MechanicalLoadUserDefinedRepository repository, QueryUpdateEmitter queryUpdateEmitter) {
    super(repository);
    this.queryUpdateEmitter = queryUpdateEmitter;
  }

  /*
   * @param	event CreateMechanicalLoadUserDefinedEvent
   */
  @EventHandler(payloadType = CreateMechanicalLoadUserDefinedEvent.class)
  public void handle(CreateMechanicalLoadUserDefinedEvent event) {
    LOGGER.info("handling CreateMechanicalLoadUserDefinedEvent - " + event);
    MechanicalLoadUserDefined entity = new MechanicalLoadUserDefined();
    entity.setMechanicalLoadUserDefinedId(event.getMechanicalLoadUserDefinedId());

    // ------------------------------------------
    // persist a new one
    // ------------------------------------------
    create(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllMechanicalLoadUserDefined(entity);
  }

  /*
   * @param	event UpdateMechanicalLoadUserDefinedEvent
   */
  @EventHandler(payloadType = UpdateMechanicalLoadUserDefinedEvent.class)
  public void handle(UpdateMechanicalLoadUserDefinedEvent event) {
    LOGGER.info("handling UpdateMechanicalLoadUserDefinedEvent - " + event);

    MechanicalLoadUserDefined entity = new MechanicalLoadUserDefined();
    entity.setMechanicalLoadUserDefinedId(event.getMechanicalLoadUserDefinedId());
    entity.setProprietary(event.getProprietary());

    // ------------------------------------------
    // save with an existing instance
    // ------------------------------------------
    update(entity);

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindMechanicalLoadUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllMechanicalLoadUserDefined(entity);
  }

  /*
   * @param	event DeleteMechanicalLoadUserDefinedEvent
   */
  @EventHandler(payloadType = DeleteMechanicalLoadUserDefinedEvent.class)
  public void handle(DeleteMechanicalLoadUserDefinedEvent event) {
    LOGGER.info("handling DeleteMechanicalLoadUserDefinedEvent - " + event);

    // ------------------------------------------
    // delete delegation
    // ------------------------------------------
    MechanicalLoadUserDefined entity = delete(event.getMechanicalLoadUserDefinedId());

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllMechanicalLoadUserDefined(entity);
  }

  /*
   * @param	event AssignProprietaryToMechanicalLoadUserDefinedEvent
   */
  @EventHandler(payloadType = AssignProprietaryToMechanicalLoadUserDefinedEvent.class)
  public void handle(AssignProprietaryToMechanicalLoadUserDefinedEvent event) {
    LOGGER.info("handling AssignProprietaryToMechanicalLoadUserDefinedEvent - " + event);

    // ------------------------------------------
    // delegate to assignTo
    // ------------------------------------------
    MechanicalLoadUserDefined entity =
        assignProprietary(event.getMechanicalLoadUserDefinedId(), event.getAssignment());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindMechanicalLoadUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllMechanicalLoadUserDefined(entity);
  }

  /*
   * @param	event UnAssignProprietaryFromMechanicalLoadUserDefinedEvent
   */
  @EventHandler(payloadType = UnAssignProprietaryFromMechanicalLoadUserDefinedEvent.class)
  public void handle(UnAssignProprietaryFromMechanicalLoadUserDefinedEvent event) {
    LOGGER.info("handling UnAssignProprietaryFromMechanicalLoadUserDefinedEvent - " + event);

    // ------------------------------------------
    // delegate to unAssignFrom
    // ------------------------------------------
    MechanicalLoadUserDefined entity = unAssignProprietary(event.getMechanicalLoadUserDefinedId());

    // ------------------------------------------
    // emit to subscribers that find one
    // ------------------------------------------
    emitFindMechanicalLoadUserDefined(entity);

    // ------------------------------------------
    // emit to subscribers that find all
    // ------------------------------------------
    emitFindAllMechanicalLoadUserDefined(entity);
  }

  /**
   * Method to retrieve the MechanicalLoadUserDefined via an MechanicalLoadUserDefinedPrimaryKey.
   *
   * @param id Long
   * @return MechanicalLoadUserDefined
   * @exception ProcessingException - Thrown if processing any related problems
   * @exception IllegalArgumentException
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public MechanicalLoadUserDefined handle(FindMechanicalLoadUserDefinedQuery query)
      throws ProcessingException, IllegalArgumentException {
    return find(query.getFilter().getMechanicalLoadUserDefinedId());
  }

  /**
   * Method to retrieve a collection of all MechanicalLoadUserDefineds
   *
   * @param query FindAllMechanicalLoadUserDefinedQuery
   * @return List<MechanicalLoadUserDefined>
   * @exception ProcessingException Thrown if any problems
   */
  @SuppressWarnings("unused")
  @QueryHandler
  public List<MechanicalLoadUserDefined> handle(FindAllMechanicalLoadUserDefinedQuery query)
      throws ProcessingException {
    return findAll(query);
  }

  /**
   * emit to subscription queries of type FindMechanicalLoadUserDefined, but only if the id matches
   *
   * @param entity MechanicalLoadUserDefined
   */
  protected void emitFindMechanicalLoadUserDefined(MechanicalLoadUserDefined entity) {
    LOGGER.info("handling emitFindMechanicalLoadUserDefined");

    queryUpdateEmitter.emit(
        FindMechanicalLoadUserDefinedQuery.class,
        query ->
            query
                .getFilter()
                .getMechanicalLoadUserDefinedId()
                .equals(entity.getMechanicalLoadUserDefinedId()),
        entity);
  }

  /**
   * unconditionally emit to subscription queries of type FindAllMechanicalLoadUserDefined
   *
   * @param entity MechanicalLoadUserDefined
   */
  protected void emitFindAllMechanicalLoadUserDefined(MechanicalLoadUserDefined entity) {
    LOGGER.info("handling emitFindAllMechanicalLoadUserDefined");

    queryUpdateEmitter.emit(FindAllMechanicalLoadUserDefinedQuery.class, query -> true, entity);
  }

  // --------------------------------------------------
  // attributes
  // --------------------------------------------------
  @Autowired private final QueryUpdateEmitter queryUpdateEmitter;
  private static final Logger LOGGER =
      Logger.getLogger(MechanicalLoadUserDefinedProjector.class.getName());
}
