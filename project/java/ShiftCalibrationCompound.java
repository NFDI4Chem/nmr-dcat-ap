package None;

import java.util.List;
import lombok.*;






/**
  A ChemicalEntity that produces one or more peaks used for chemical shift calibration in nuclear magnetic resonance (NMR) spectroscopy.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ShiftCalibrationCompound extends ChemicalEntity {

  private List<CalibrationPeakShift> hasCalibrationShift;

}