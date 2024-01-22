package monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import static java.lang.System.*;
public interface Monster
{
public int getHowBig();
public String getName();
public boolean isBigger(Monster reference);
public boolean isSmaller(Monster reference);
public boolean namesTheSame(Monster reference);
}
