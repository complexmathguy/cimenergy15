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
package com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.validator;

import com.occulue.api.*;
import org.springframework.util.Assert;

public class ProtectedSwitchValidator {

  /** default constructor */
  protected ProtectedSwitchValidator() {}

  /** factory method */
  public static ProtectedSwitchValidator getInstance() {
    return new ProtectedSwitchValidator();
  }

  /** handles creation validation for a ProtectedSwitch */
  public void validate(CreateProtectedSwitchCommand protectedSwitch) throws Exception {
    Assert.notNull(protectedSwitch, "CreateProtectedSwitchCommand should not be null");
    //		Assert.isNull( protectedSwitch.getProtectedSwitchId(), "CreateProtectedSwitchCommand
    // identifier should be null" );
  }

  /** handles update validation for a ProtectedSwitch */
  public void validate(UpdateProtectedSwitchCommand protectedSwitch) throws Exception {
    Assert.notNull(protectedSwitch, "UpdateProtectedSwitchCommand should not be null");
    Assert.notNull(
        protectedSwitch.getProtectedSwitchId(),
        "UpdateProtectedSwitchCommand identifier should not be null");
  }

  /** handles delete validation for a ProtectedSwitch */
  public void validate(DeleteProtectedSwitchCommand protectedSwitch) throws Exception {
    Assert.notNull(protectedSwitch, "{commandAlias} should not be null");
    Assert.notNull(
        protectedSwitch.getProtectedSwitchId(),
        "DeleteProtectedSwitchCommand identifier should not be null");
  }

  /** handles fetchOne validation for a ProtectedSwitch */
  public void validate(ProtectedSwitchFetchOneSummary summary) throws Exception {
    Assert.notNull(summary, "ProtectedSwitchFetchOneSummary should not be null");
    Assert.notNull(
        summary.getProtectedSwitchId(),
        "ProtectedSwitchFetchOneSummary identifier should not be null");
  }
}
