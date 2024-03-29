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
package com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.standardmodels.winddynamics.controller.query;

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
 * Implements Spring Controller query CQRS processing for entity WindContQIEC.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/WindContQIEC")
public class WindContQIECQueryRestController extends BaseSpringRestController {

  /**
   * Handles loading a WindContQIEC using a UUID
   *
   * @param UUID windContQIECId
   * @return WindContQIEC
   */
  @GetMapping("/load")
  public WindContQIEC load(@RequestParam(required = true) UUID windContQIECId) {
    WindContQIEC entity = null;

    try {
      entity =
          WindContQIECBusinessDelegate.getWindContQIECInstance()
              .getWindContQIEC(new WindContQIECFetchOneSummary(windContQIECId));
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load WindContQIEC using Id " + windContQIECId);
      return null;
    }

    return entity;
  }

  /**
   * Handles loading all WindContQIEC business objects
   *
   * @return Set<WindContQIEC>
   */
  @GetMapping("/")
  public List<WindContQIEC> loadAll() {
    List<WindContQIEC> windContQIECList = null;

    try {
      // load the WindContQIEC
      windContQIECList =
          WindContQIECBusinessDelegate.getWindContQIECInstance().getAllWindContQIEC();

      if (windContQIECList != null) LOGGER.log(Level.INFO, "successfully loaded all WindContQIECs");
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load all WindContQIECs ", exc);
      return null;
    }

    return windContQIECList;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected WindContQIEC windContQIEC = null;
  private static final Logger LOGGER =
      Logger.getLogger(WindContQIECQueryRestController.class.getName());
}
