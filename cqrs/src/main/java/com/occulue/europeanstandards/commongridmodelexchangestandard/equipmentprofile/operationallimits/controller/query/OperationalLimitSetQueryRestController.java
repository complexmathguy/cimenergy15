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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.operationallimits.controller.query;

import com.occulue.api.*;
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
 * Implements Spring Controller query CQRS processing for entity OperationalLimitSet.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/OperationalLimitSet")
public class OperationalLimitSetQueryRestController extends BaseSpringRestController {

  /**
   * Handles loading a OperationalLimitSet using a UUID
   *
   * @param UUID operationalLimitSetId
   * @return OperationalLimitSet
   */
  @GetMapping("/load")
  public OperationalLimitSet load(@RequestParam(required = true) UUID operationalLimitSetId) {
    OperationalLimitSet entity = null;

    try {
      entity =
          OperationalLimitSetBusinessDelegate.getOperationalLimitSetInstance()
              .getOperationalLimitSet(
                  new OperationalLimitSetFetchOneSummary(operationalLimitSetId));
    } catch (Throwable exc) {
      LOGGER.log(
          Level.WARNING, "failed to load OperationalLimitSet using Id " + operationalLimitSetId);
      return null;
    }

    return entity;
  }

  /**
   * Handles loading all OperationalLimitSet business objects
   *
   * @return Set<OperationalLimitSet>
   */
  @GetMapping("/")
  public List<OperationalLimitSet> loadAll() {
    List<OperationalLimitSet> operationalLimitSetList = null;

    try {
      // load the OperationalLimitSet
      operationalLimitSetList =
          OperationalLimitSetBusinessDelegate.getOperationalLimitSetInstance()
              .getAllOperationalLimitSet();

      if (operationalLimitSetList != null)
        LOGGER.log(Level.INFO, "successfully loaded all OperationalLimitSets");
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load all OperationalLimitSets ", exc);
      return null;
    }

    return operationalLimitSetList;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected OperationalLimitSet operationalLimitSet = null;
  private static final Logger LOGGER =
      Logger.getLogger(OperationalLimitSetQueryRestController.class.getName());
}
