import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args)  {
		// System.out.println(findX(6));
		
		String block = "to be or not to be";
		String axe = ".\\s.";
		String[] chunks = block.split(axe);
		System.out.println(Arrays.toString(chunks));
		
		Queue<Object> que = new LinkedList<>();
		String pattern = "aabbcddddefffg";
		for (char c: pattern.toCharArray()) {
			que.add(c);
		}
		while(!que.isEmpty()) {
			if (!que.remove().equals(que.peek())) {
				//System.out.println(que.remove());
			}
		}
		
		int[][] grid = {{1,2,3,4},{5,6,7},{8,9},{10}};
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = grid[j][i];
			}
		}
		System.out.println(Arrays.deepToString(grid));
		
		
		
		
	}
	public static int findX(int x) {
		int i = -1;
		int code = 0;
		int[] a = {7,1,3,4,9,8,2,5,0,9};
		
		try {
			while (a[++i] != x) {}
		}
		catch (RuntimeException e){
			code = code * 10 + 1;
		}
		catch (Exception e){
			code = code * 10 + 2;
		}
		finally {
			code = code * 10 + 3;
		}
		System.out.println(code);
		return i; 
		
	
	}
}
