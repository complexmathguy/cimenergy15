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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel.projector;

import com.occulue.api.*;
import com.occulue.entity.*;
import com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel.repository.*;
import com.occulue.exception.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Projector for EnergyArea as outlined for the CQRS pattern.
 *
 * <p>Commands are handled by EnergyAreaAggregate
 *
 * @author your_name_here
 */
@Component("energyArea-entity-projector")
public class EnergyAreaEntityProjector {

  // core constructor
  public EnergyAreaEntityProjector(EnergyAreaRepository repository) {
    this.repository = repository;
  }

  /*
   * Insert a EnergyArea
   *
   * @param	entity EnergyArea
   */
  public EnergyArea create(EnergyArea entity) {
    LOGGER.info("creating " + entity.toString());

    // ------------------------------------------
    // persist a new one
    // ------------------------------------------
    return repository.save(entity);
  }

  /*
   * Update a EnergyArea
   *
   * @param	entity EnergyArea
   */
  public EnergyArea update(EnergyArea entity) {
    LOGGER.info("updating " + entity.toString());

    // ------------------------------------------
    // save with an existing instance
    // ------------------------------------------
    return repository.save(entity);
  }

  /*
   * Delete a EnergyArea
   *
   * @param	id		UUID
   */
  public EnergyArea delete(UUID id) {
    LOGGER.info("deleting " + id.toString());

    // ------------------------------------------
    // locate the entity by the provided id
    // ------------------------------------------
    EnergyArea entity = repository.findById(id).get();

    // ------------------------------------------
    // delete what is discovered
    // ------------------------------------------
    repository.delete(entity);

    return entity;
  }

  /**
   * Method to retrieve the EnergyArea via an FindEnergyAreaQuery
   *
   * @return query FindEnergyAreaQuery
   */
  @SuppressWarnings("unused")
  public EnergyArea find(UUID id) {
    LOGGER.info("handling find using " + id.toString());
    try {
      return repository.findById(id).get();
    } catch (IllegalArgumentException exc) {
      LOGGER.log(Level.WARNING, "Failed to find a EnergyArea - {0}", exc.getMessage());
    }
    return null;
  }

  /**
   * Method to retrieve a collection of all EnergyAreas
   *
   * @param query FindAllEnergyAreaQuery
   * @return List<EnergyArea>
   */
  @SuppressWarnings("unused")
  public List<EnergyArea> findAll(FindAllEnergyAreaQuery query) {
    LOGGER.info("handling findAll using " + query.toString());
    try {
      return repository.findAll();
    } catch (IllegalArgumentException exc) {
      LOGGER.log(Level.WARNING, "Failed to find all EnergyArea - {0}", exc.getMessage());
    }
    return null;
  }

  // --------------------------------------------------
  // attributes
  // --------------------------------------------------
  @Autowired protected final EnergyAreaRepository repository;

  private static final Logger LOGGER = Logger.getLogger(EnergyAreaEntityProjector.class.getName());
}
