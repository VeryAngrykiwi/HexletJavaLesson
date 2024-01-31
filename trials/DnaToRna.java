public class DnaToRna {
  public static String dnaToRna(String dna){
    if (dna.isEmpty()) {
      return "";
    }
    StringBuilder rna = new StringBuilder();
    for (char nucleotide : dna.toCharArray()) {
      switch (nucleotide) {
        case 'G':
          rna.append('C');
          break;
        case 'C':
          rna.append('G');
          break;
        case 'T':
          rna.append('A');
          break;
        case 'A':
          rna.append('U');
          break;
        default:
          return null;
      }
    }
    return rna.toString();
  }
}