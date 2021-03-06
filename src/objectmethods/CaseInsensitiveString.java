package objectmethods;

/**
 * Created by Michas on 03/04/15.
 */
public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{
    private final String s;
    public CaseInsensitiveString(String s){
        this.s = s;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString)o).s.equalsIgnoreCase(this.s);
    }

    @Override
    public int hashCode(){
        return s.length();
    }

    @Override
    public int compareTo(CaseInsensitiveString o) {
        return s.compareTo(o.s);
    }
}
