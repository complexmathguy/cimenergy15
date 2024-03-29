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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel.controller.query;

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
 * Implements Spring Controller query CQRS processing for entity LoadGroup.
 *
 * @author your_name_here
 */
@CrossOrigin
@RestController
@RequestMapping("/LoadGroup")
public class LoadGroupQueryRestController extends BaseSpringRestController {

  /**
   * Handles loading a LoadGroup using a UUID
   *
   * @param UUID loadGroupId
   * @return LoadGroup
   */
  @GetMapping("/load")
  public LoadGroup load(@RequestParam(required = true) UUID loadGroupId) {
    LoadGroup entity = null;

    try {
      entity =
          LoadGroupBusinessDelegate.getLoadGroupInstance()
              .getLoadGroup(new LoadGroupFetchOneSummary(loadGroupId));
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load LoadGroup using Id " + loadGroupId);
      return null;
    }

    return entity;
  }

  /**
   * Handles loading all LoadGroup business objects
   *
   * @return Set<LoadGroup>
   */
  @GetMapping("/")
  public List<LoadGroup> loadAll() {
    List<LoadGroup> loadGroupList = null;

    try {
      // load the LoadGroup
      loadGroupList = LoadGroupBusinessDelegate.getLoadGroupInstance().getAllLoadGroup();

      if (loadGroupList != null) LOGGER.log(Level.INFO, "successfully loaded all LoadGroups");
    } catch (Throwable exc) {
      LOGGER.log(Level.WARNING, "failed to load all LoadGroups ", exc);
      return null;
    }

    return loadGroupList;
  }

  // ************************************************************************
  // Attributes
  // ************************************************************************
  protected LoadGroup loadGroup = null;
  private static final Logger LOGGER =
      Logger.getLogger(LoadGroupQueryRestController.class.getName());
}
