
public class Exam2_class {
	
	static void Switch(char choice) {
        switch(choice) {
        case '1':
            System.out.println("The if:\n");
            System.out.println("if(condition) statement;");
            System.out.println("else statement;");
            System.out.println();
            System.out.println("-------------------------------------");
            break;
        case '2':
            System.out.println("The switch:\n");
            System.out.println("switch(expression){");
            System.out.println("   case constant:");
            System.out.println("      statement sequence");
            System.out.println("      break;");
            System.out.println("   //...");
            System.out.println("}");
            System.out.println();
            System.out.println("-------------------------------------");
            break;
        default:
            System.out.print("Selection not found");
            System.out.println();
            System.out.println("-------------------------------------");
            
        }

	}
}
