package hojadetrabajo6;

/**
 *
 * @author Gerardo
 */
public class MapFactory 
{
    public iMap getMap(int index)
    {
        switch(index){
            case 1:
                return new Hash();
                
            case 2:
                return new Tree();
                
            case 3:
                return new LinkedHash();
                
            default:
                break;
                
        }
        return null;
    }
}
