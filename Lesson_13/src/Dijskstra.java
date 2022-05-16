public class Dijskstra {
    public static void main(String[] args) {
        int [][] graph = {
                {0,2,0,0,0,0},
                {0,0,1,2,1,0},
                {0,0,0,2,0,4},
                {0,0,2,0,0,0},
                {0,0,0,0,0,8},
                {0,0,0,0,0,0}
        };
        int start = 0;
        int finish = 5;

        dijskstra(graph, start, finish);

    }

    public static void dijskstra(int[][] graph, int start, int finish){
        int v = graph.length;

        boolean[] visited = new boolean[v];
        int[] distance = new int[v];

        distance[start] = 0;
        for(int i = 1; i<v; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < v -1; i++){
            //Tìm đỉnh kề có khoảng cách nhỏ nhất
            int minVerter = -1;
            for(int j = 0 ; j < distance.length; j++){
                if(!visited[j]){
                    if(minVerter == -1 || distance[i] < distance[minVerter]){
                        minVerter = i;
                    }
                }
            }

            visited[minVerter] = true;

            //Tìm đỉnh kề với đỉnh minVerter
            for(int j = 0; j < v; j++){
                if(graph[minVerter][j] != 0 && !visited[j]){
                    if(distance[minVerter] != Integer.MAX_VALUE){
                        int newDistance = distance[minVerter] + graph[minVerter][j];
                        if(newDistance < distance[j]){
                            distance[j] = newDistance;
                        }
                    }
                }
            }



        }
        //System.out.println(distance[finish]);
        System.out.println(start + " -> " + finish + " = " + distance[finish]);

        for (int i = 0 ; i < v; i++){
            System.out.println(i + " - " + distance[i]);
        }
    }
}
