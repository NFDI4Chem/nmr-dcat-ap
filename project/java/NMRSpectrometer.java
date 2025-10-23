package None;

import java.util.List;
import lombok.*;






/**
  A Spectrometer used to conduct NMR experiments consisting of a magnet housing a sample space surrounded by two coils which act to transmit radio frequency radiation to the sample and to detect the response of the sample.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class NMRSpectrometer extends Device {

  private List<NominalProtonFrequency> hasProtonFrequency;

}