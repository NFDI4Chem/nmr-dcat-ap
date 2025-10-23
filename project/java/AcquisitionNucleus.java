package None;

import java.util.List;
import lombok.*;






/**
  The nucleus of an Atom that is being studied during an NMR analysis.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class AcquisitionNucleus extends AgenticEntity {

  private Atom nucleusOf;

}