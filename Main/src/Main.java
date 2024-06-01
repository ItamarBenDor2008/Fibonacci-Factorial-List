import java.util.*;

public class Main 
{
    // יוצר פונקציה לחישוב רשימת פיבואנצי
    public static int[] FibonacciList(int number)
    {
        // מגדיר עד איזה מקום בליסט צריך להתקיים באמצעות המספר
        int[] intArray = new int[number];

        // נגדיר שני משתנים שבאמצעותם נשמור ונעשה את החישובים
        int num1 = 0;
        int num2 = 1;

        // במקרה שהמספר הוא אחד (רוצים להגיע למקום 1 ברשימה) מקרה זה מיוחד ופשוט נגדיר את המקום שווה למספר כי המקום הראשון בפיבאונצי הוא אחד
        if(number == 1)
        {
            intArray[0] = number;
        }
        // מקרה זה דומה למקרה קודם רק שמקום נגדיר שמקום שווה למספר נגדיר מקום שווה לאחד
        else if(number == 2)  
        {
            intArray[0] = 1;
            intArray[1] = 1;
        }
        // כשלא יהיה מקרה מיוחד נמשיך את התוכנית כרגיל
        else 
        {
            // רק את ההתחלה נגדיר כמקום אחד ומשם את כל שאר המקומות נשתמש בלולאה
            intArray[0] = 1;
            // נריץ את הלולאה מאחד כמקום 0 (שזה מקום אחד) הגדרנו כבר ורציץ כל עוד המשתנה שלנו קטן מהמספר
            for(int i = 1; i < number; i++)
            {
                // נשתמש במספרים שהגדרנו מקודם כאמצעי עזר לחישוב
                intArray[i] = num2 + num1;
                
                // אחרי שחישבנו את המקום צריכים להגדיר ערך חדש למשתנים כדי לחשב את המקום הבא
                num1 = num2;
                num2 =  intArray[i];
                // נגדיר את המשתנה הראשון כהמקום הקודם ואת המשתנה האחר כמקום שחושב הרגע וכך נוכל לחשב

                // דוגמא: המספר הראשון שווה ל0 והמספר השני שווה ל1 ומקום אחד ברשימה שווה לחיבור של שני המספרים שיהיה שווה ל1

                // ואז נגדיר מספר ראשון שווה למספר שני שווה 1 ואז מספר שני לתוצאה של החיבור מקודם וכך יוכל לצאת לנו בהמשך את המסספרים שאנו צריכים
            }
        }
        
        // מחזירים את הרשימה אחרי כל החישובים לצורך חישוב סופי של חילוק שתי הרשימות: עשרת חלקי פיבאונצי
        return intArray;
    }
    // יוצר פונקציה לחישוב עצרת
    public static int[] FactorialList(int number)
    {
        int[] intArray = new int[number];

        int num1 = 1;
        int num2 = 0; 

        // במקרה שהמספר הוא אחד (רוצים להגיע למקום 1 ברשימה) מקרה זה מיוחד ופשוט נגדיר את המקום שווה למספר כי המקום הראשון בעצרת הוא אחד
        if(number == 1)
        {
            intArray[0] = number;
        }
        // מקרה זה דומה למקרה קודם רק שמקום נגדיר שמקום שווה למספר נגדיר מקום שווה לאחד
        else if(number == 2)  
        {
            intArray[0] = 1;
            intArray[1] = 1;
        }
        // כשלא יהיה מקרה מיוחד נמשיך את התוכנית כרגיל
        else 
        {
            // כרגיל מגדירים מקום ראשון תמיד שווה ל1
            intArray[0] = 1;
            // נריץ לולאה לחישוב שאר המקומות
            for (int i = 1; i < number; i++) 
            {
                // נגדיר את המשתנה לשימוש חוזר לחישוב של המכפלה נניח לדוגמא במקום הראשון זה יהיה 1 *1 
                num2 = num1 * i;
                // נשים את התוצאה במקום שלו ברשימה
                intArray[i] = num2;
                // בסוף הלולאה נשווה את המשתנה השני למכפלה כך במקרה שנגיד הלולאה תגיע לשלוש פעמים אז זה יהיה שלוש כפול שתיים
                num1 = num2;
            }
        }
        // נחזיר את הרשימה הסופית
        return intArray;
    }
    // יוצר קלט כדי המשך להתשמש בו כדי לקלוט מהמשתמש מספר
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        // מבקש מהמשתמש את המספר באמצעותו נגיע למקום הרצוי בשתי הרשימות
        System.out.println("Enter your number: ");
        
        int number = scanner.nextInt();

        // יוצר את הרשימות לפי המספר שקלטנו וקורא לפונקציה של כל אחד מהרשימות
        int [] FibonacciListFinal = FibonacciList(number);

        int [] FactorialListFinal = FactorialList(number);
        
        // יוצר את הרשימה הסופית שהיא תהייה חישוב של שתי הרשימות
        int [] FinalListResult = new int[number];

        // יוצרים לולאת פור כדי לחשב את הרשימה הסופית מ0 עד סוף הרשימה לפי המספר
        for (int i = 0; i < number; i++) 
        { 
            // עושה חישוב פשוט שלעבור על כל מקום ברשימה ולהציב את אותו מקום בשתי הרשימות חלקי אחד לשני
            FinalListResult[i] = FactorialListFinal[i] / FibonacciListFinal[i];
        }

        // מדפיס סופית את כל הרשימות
        System.out.println("Your Fibonacci List: " + Arrays.toString(FibonacciListFinal)); 

        System.out.println("Your Factorial List: " + Arrays.toString(FactorialListFinal));

        System.out.println("Your Final List" + Arrays.toString(FinalListResult));

    }
}
