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
package com.occulue.test;

import java.util.logging.*;

/**
 * Base class for application Test classes.
 *
 * @author your_name_here
 */
public class BaseTest {
  /** hidden */
  protected BaseTest() {}

  public static void runTheTest(Handler logHandler) {
    try {
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .ACDCConverterTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .ACDCConverterDCTerminalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .ACDCTerminalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .ACLineSegmentTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AccumulatorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AccumulatorLimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AccumulatorLimitSetTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AccumulatorResetTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AccumulatorValueTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ActivePowerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile
              .operationallimits.test.ActivePowerLimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ActivePowerPerCurrentFlowTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ActivePowerPerFrequencyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AnalogTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AnalogControlTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AnalogLimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AnalogLimitSetTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .AnalogValueTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .AngleDegreesTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .AngleRadiansTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ApparentPowerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile
              .operationallimits.test.ApparentPowerLimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .AreaTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .AsynchronousMachineTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.asynchronousmachinedynamics.test.AsynchronousMachineDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.asynchronousmachinedynamics.test
              .AsynchronousMachineEquivalentCircuitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.asynchronousmachinedynamics.test
              .AsynchronousMachineTimeConstantReactanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.AsynchronousMachineUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.BaseVoltageTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .BasicIntervalScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .BayTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .BooleanProxyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.test.BoundaryExtensionsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .BreakerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.topology
              .test.BusNameMarkerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .BusbarSectionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .CapacitanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .CapacitancePerLengthTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .CommandTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ConductanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.ConductingEquipmentTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .ConductorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.ConformLoadTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.ConformLoadGroupTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.ConformLoadScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.ConnectivityNodeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.ConnectivityNodeContainerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .wires.test.ConnectorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .ControlTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.controlarea
              .test.ControlAreaTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.controlarea
              .test.ControlAreaGeneratingUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.geographicallocationprofile
              .common.test.CoordinateSystemTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .CsConverterTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .CurrentFlowTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile
              .operationallimits.test.CurrentLimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .CurveTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .CurveDataTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCBaseTerminalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCBreakerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCBusbarTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCChopperTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCConductingEquipmentTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCConverterUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCDisconnectorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCEquipmentContainerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCGroundTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCLineTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCLineSegmentTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCNodeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCSeriesDeviceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCShuntTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCSwitchTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .DCTerminalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile.dc
              .test.DCTopologicalIslandTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.topologyprofile.dc.test
              .DCTopologicalNodeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .DateProxyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .DateTimeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.DayTypeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .DecimalProxyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.DiagramTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile.test
              .DiagramLayoutVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.DiagramObjectTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.DiagramObjectGluePointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.DiagramObjectPointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.DiagramObjectStyleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.DiagramStyleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.discontinuousexcitationcontroldynamics.test.DiscExcContIEEEDEC1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.discontinuousexcitationcontroldynamics.test.DiscExcContIEEEDEC2ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.discontinuousexcitationcontroldynamics.test.DiscExcContIEEEDEC3ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .DisconnectorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.discontinuousexcitationcontroldynamics.test
              .DiscontinuousExcitationControlDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.DiscontinuousExcitationControlUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .DiscreteTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .DiscreteValueTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .DomainVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.test.DynamicsFunctionBlockTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile.test
              .DynamicsVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardinterconnections.test.DynamicsmodelTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.test.ENTSOEConnectivityNodeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.test.ENTSOEIdentifiedObjectTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.test.ENTSOEJunctionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.operationallimits.test
              .ENTSOEOperationalLimitTypeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.test.ENTSOETopologicalNodeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .EarthFaultCompensatorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.EnergyAreaTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .EnergyConsumerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.test.EnergySchedulingTypeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .wires.test.EnergySourceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.EquipmentTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .test.EquipmentBoundaryVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.EquipmentContainerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.test
              .EquipmentVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.equivalents
              .test.EquivalentBranchTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.equivalents
              .test.EquivalentEquipmentTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.equivalents
              .test.EquivalentInjectionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.equivalents
              .test.EquivalentNetworkTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.equivalents
              .test.EquivalentShuntTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAC1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAC2ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAC3ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAC4ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAC5ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAC6ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAC8BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcANSTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAVR1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAVR2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAVR3Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAVR4Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAVR5Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcAVR7Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcBBCTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcCZTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcDC1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcDC2ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcDC3ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcDC3A1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcELIN1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcELIN2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcHUTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC2ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC3ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC4ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC5ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC6ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC7BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEAC8BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEDC1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEDC2ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEDC3ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEDC4BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEST1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEST2ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEST3ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEST4BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEST5BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEST6BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcIEEEST7BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcOEX3TTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcPICTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcREXSTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcSCRXTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcSEXSTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcSKTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcST1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcST2ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcST3ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcST4BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcST6BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcST7BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.excitationsystemdynamics.test.ExcitationSystemDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.ExcitationSystemUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.extension.test.ExtensionVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .ExternalNetworkInjectionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .FloatProxyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.FossilFuelTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .FrequencyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.voltagecompensatordynamics.test.GenICompensationForGenJTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.GeneratingUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.geographicallocationprofile
              .test.GeographicalLocationVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.GeographicalRegionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovCT1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovCT2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovGASTTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovGAST1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovGAST2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovGAST3Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovGAST4Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovGASTWDTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydro1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydro2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydro3Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydro4Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroDDTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroFrancisTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroIEEE0Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroIEEE2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroPIDTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroPID2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroPeltonTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroRTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroWEHTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovHydroWPIDTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteam0Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteam1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteam2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteamCCTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteamEUTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteamFV2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteamFV3Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteamFV4Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteamIEEE1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.GovSteamSGOTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.GrossToNetActivePowerCurveTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .GroundTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .GroundDisconnectorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .GroundingImpedanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.HydroGeneratingUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.HydroPowerPlantTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.HydroPumpTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.IdentifiedObjectTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .InductanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .InductancePerLengthTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .IntegerProxyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .wires.test.JunctionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .LengthTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .LimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .LimitSetTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .wires.test.LineTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .LinearShuntCompensatorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.loaddynamics.test.LoadAggregateTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.LoadAreaTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .LoadBreakSwitchTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.loaddynamics.test.LoadCompositeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.loaddynamics.test.LoadDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.loaddynamics.test.LoadGenericNonLinearTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.LoadGroupTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.loaddynamics.test.LoadMotorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.LoadResponseCharacteristicTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.loaddynamics.test.LoadStaticTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.LoadUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.geographicallocationprofile
              .common.test.LocationTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .MeasurementTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .MeasurementValueTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .MeasurementValueQualityTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .MeasurementValueSourceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.mechanicalloaddynamics.test.MechLoad1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.mechanicalloaddynamics.test.MechanicalLoadDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.MechanicalLoadUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .MoneyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .MonthDayTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .MonthDayIntervalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .MutualCouplingTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.NonConformLoadTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.NonConformLoadGroupTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.NonConformLoadScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .NonlinearShuntCompensatorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .NonlinearShuntCompensatorPointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.NuclearGeneratingUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile
              .operationallimits.test.OperationalLimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile
              .operationallimits.test.OperationalLimitSetTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile
              .operationallimits.test.OperationalLimitTypeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.overexcitationlimiterdynamics.test.OverexcLim2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.overexcitationlimiterdynamics.test.OverexcLimIEEETest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.overexcitationlimiterdynamics.test.OverexcLimX1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.overexcitationlimiterdynamics.test.OverexcLimX2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.overexcitationlimiterdynamics.test.OverexcitationLimiterDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.OverexcitationLimiterUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.pfvarcontrollertype1dynamics.test.PFVArControllerType1DynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.PFVArControllerType1UserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.pfvarcontrollertype2dynamics.test.PFVArControllerType2DynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.PFVArControllerType2UserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.pfvarcontrollertype1dynamics.test.PFVArType1IEEEPFControllerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.pfvarcontrollertype1dynamics.test.PFVArType1IEEEVArControllerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.pfvarcontrollertype2dynamics.test.PFVArType2Common1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.pfvarcontrollertype2dynamics.test.PFVArType2IEEEPFControllerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.pfvarcontrollertype2dynamics.test.PFVArType2IEEEVArControllerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test.PUTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .PerCentTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .PerLengthDCLineParameterTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PetersenCoilTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerAsymmetricalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerLinearTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerNonLinearTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerSymmetricalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerTableTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerTablePointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PhaseTapChangerTabularTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.geographicallocationprofile
              .common.test.PositionPointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.PowerSystemResourceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PowerSystemStabilizerDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.PowerSystemStabilizerUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PowerTransformerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .PowerTransformerEndTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.ProprietaryParameterDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .ProtectedSwitchTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.Pss1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.Pss1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.Pss2BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.Pss2STTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.Pss5Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssELIN2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssIEEE1ATest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssIEEE2BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssIEEE3BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssIEEE4BTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssPTIST1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssPTIST3Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssSB4Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssSHTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssSKTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.powersystemstabilizerdynamics.test.PssWECCTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .Quality61850Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .RaiseLowerCommandTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .RatioTapChangerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .RatioTapChangerTableTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .RatioTapChangerTablePointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ReactanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .ReactiveCapabilityCurveTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ReactivePowerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .RegularIntervalScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .RegularTimePointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .RegulatingCondEqTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .RegulatingControlTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .RegulationScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardinterconnections.test.RemoteInputSignalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .ReportingGroupTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ResistanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .ResistancePerLengthTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .RotatingMachineTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.test.RotatingMachineDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .RotationSpeedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.SeasonTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.SeasonDayTypeScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .SecondsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .SeriesCompensatorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .SetPointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .ShuntCompensatorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .Simple_FloatTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.SolarGeneratingUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile.test
              .StateVariablesVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .StaticVarCompensatorTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardinterconnections.test.StaticpowersystemmodelTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.StationSupplyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.steadystatehypothesisprofile
              .test.SteadyStateHypothesisVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .StringMeasurementTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .StringMeasurementValueTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .StringProxyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.SubGeographicalRegionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.loadmodel
              .test.SubLoadAreaTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .SubstationTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .SusceptanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile
              .statevariables.test.SvInjectionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile
              .statevariables.test.SvPowerFlowTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile
              .statevariables.test.SvShuntCompensatorSectionsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile
              .statevariables.test.SvStatusTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile
              .statevariables.test.SvTapStepTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile
              .statevariables.test.SvVoltageTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.steadystatehypothesisprofile
              .wires.test.SwitchItTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .SwitchProxyTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .SwitchScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .SynchronousMachineTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.synchronousmachinedynamics.test.SynchronousMachineDetailedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.synchronousmachinedynamics.test.SynchronousMachineDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.synchronousmachinedynamics.test
              .SynchronousMachineEquivalentCircuitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.synchronousmachinedynamics.test.SynchronousMachineSimplifiedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.synchronousmachinedynamics.test
              .SynchronousMachineTimeConstantReactanceTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.SynchronousMachineUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .TapChangerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .TapChangerControlTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .TapChangerTablePointTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .TapScheduleTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .TemperatureTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentboundaryprofile
              .core.test.TerminalTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.TextDiagramObjectTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.ThermalGeneratingUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.controlarea
              .test.TieFlowTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.statevariablesprofile
              .topology.test.TopologicalIslandTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.topologyboundaryprofile
              .topology.test.TopologicalNodeTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.topologyboundaryprofile.test
              .TopologyBoundaryVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.topologyprofile.test
              .TopologyVersionTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.wires.test
              .TransformerEndTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbineloadcontrollerdynamics.test.TurbLCFB1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbinegovernordynamics.test.TurbineGovernorDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.TurbineGovernorUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.turbineloadcontrollerdynamics.test.TurbineLoadControllerDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.TurbineLoadControllerUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.underexcitationlimiterdynamics.test.UnderexcLim2SimplifiedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.underexcitationlimiterdynamics.test.UnderexcLimIEEE1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.underexcitationlimiterdynamics.test.UnderexcLimIEEE2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.underexcitationlimiterdynamics.test.UnderexcLimX1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.underexcitationlimiterdynamics.test.UnderexcLimX2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.underexcitationlimiterdynamics.test
              .UnderexcitationLimiterDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.UnderexcitationLimiterUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardinterconnections.test.UnresolvednameTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.voltageadjusterdynamics.test.VAdjIEEETest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.voltagecompensatordynamics.test.VCompIEEEType1Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.voltagecompensatordynamics.test.VCompIEEEType2Test()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .ValueAliasSetTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.meas.test
              .ValueToAliasTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.diagramlayoutprofile
              .diagramlayout.test.VisibilityLayerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .VoltageTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.voltageadjusterdynamics.test.VoltageAdjusterDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.VoltageAdjusterUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.voltagecompensatordynamics.test.VoltageCompensatorDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.VoltageCompensatorUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.core.test
              .VoltageLevelTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile
              .operationallimits.test.VoltageLimitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .VoltagePerReactivePowerTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.domainprofile.test
              .VolumeFlowRateTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .VsCapabilityCurveTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.dc.test
              .VsConverterTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindAeroConstIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindAeroLinearIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindContCurrLimIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindContPType3IECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindContPType4aIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindContPType4bIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindContPitchAngleIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindContQIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindContRotorRIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindDynamicsLookupTableTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindGenTurbineType1IECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindGenTurbineType2IECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindGenTurbineType3IECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindGenTurbineType3aIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindGenTurbineType3bIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindGenType4IECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.equipmentprofile.production
              .test.WindGeneratingUnitTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindMechIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindPitchContEmulIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindPlantDynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindPlantFreqPcontrolIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindPlantIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindPlantReactiveControlIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.WindPlantUserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindProtectionIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindTurbineType1or2DynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindTurbineType1or2IECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindTurbineType3or4DynamicsTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindTurbineType3or4IECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindTurbineType4aIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .standardmodels.winddynamics.test.WindTurbineType4bIECTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.WindType1or2UserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
      new com.occulue.europeanstandards.commongridmodelexchangestandard.dynamicsprofile
              .userdefinedmodels.test.WindType3or4UserDefinedTest()
          .setHandler(logHandler)
          .startTest();
      Thread.sleep(timeToWait);
    } catch (Throwable exc) {
      exc.printStackTrace();
    }
  }
  // -----------------------------------------------------
  // attributes
  // -----------------------------------------------------
  private static final Integer timeToWait = 5000; // milliseconds
}
