package MMC;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panagiotis Papadakos <papadako@gmail.com>
 */
interface Symmetry {
    
    public void doNothing(String a) throws SymmetryActionOnNonValidAtonalRow;
    public void transpose(String a,int x) throws SymmetryActionOnNonValidAtonalRow;
    public void retrograde(String a) throws SymmetryActionOnNonValidAtonalRow;
    public void reflect(String a,int x) throws SymmetryActionOnNonValidAtonalRow;
    
}
