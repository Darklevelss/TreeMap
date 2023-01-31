package co.edu.uptc.logica.control;

import java.util.Map;
import java.util.TreeMap;

public class Controller {
    TreeMap<Integer,String> treeMap=new TreeMap<Integer, String>();
    public boolean add(Integer pos,String nombre){
        if (!treeMap.containsKey(pos)||pos!=null||nombre!=null){
            treeMap.put(pos, nombre);
            return true;
        }
        return false;
    }
    public Map<Integer, String> getTreeMap(){

        return treeMap;
    }
    public boolean deleteById(Integer pos){
        if (!treeMap.containsKey(pos)){
            treeMap.remove(pos);
            return true;
        }
        return false;
    }


}
