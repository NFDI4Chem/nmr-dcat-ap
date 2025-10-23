package None;

import java.util.List;
import lombok.*;






/**
  Spectroscopy where the energy states of spin-active nuclei placed in a static magnetic field are interrogated by inducing transitions between the states via radio frequency irradiation. Each experiment consists of a sequence of radio frequency pulses with delay periods in between them.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NMRSpectroscopy extends DataGeneratingActivity {

  private List<NMRSpectrometer> usedSpectrometer;
  private List<NMRSolvent> usedSolvent;
  private PulseSequence usedPulseSequence;
  private NumberOfScans usedNumberOfScans;
  private NMRSampleTemperature usedSampleTemperature;
  private List<AcquisitionNucleus> probesNucleus;
  private List<ShiftCalibrationCompound> usedCalibrationCompound;
  private List<ShiftReferenceCompound> usedReferenceCompound;

}