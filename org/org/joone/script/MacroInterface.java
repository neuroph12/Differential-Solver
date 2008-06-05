/* Generated by Together */

package org.joone.script;

public interface MacroInterface extends org.joone.engine.NeuralNetListener {
    /** Exports an internal variable in the script's namespace
     * @param name - the name of the variable in the script's namespace
     * @param jObject - the value of the exported variable
     */
    public void set(String name, Object jObject);

    /** Run a generic macro contained in a text
     * @parameter the text of the macro
     */
    public void runMacro(String text);
    /** Getter for property macroManager.
     * @return Value of property macroManager.
     */
    public MacroManager getMacroManager();
    /** Setter for property macroManager.
     * @param macroManager New value of property macroManager.
     */
    public void setMacroManager(MacroManager macroManager);
}
