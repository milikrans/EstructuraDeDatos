public class Main {
    public static void main(String[] args) {
        NodoBinario root = new NodoBinario<String>(
                "10",
                new NodoBinario<>(
                        "5",
                        new NodoBinario<>("1"),
                        null
                ),
                new NodoBinario<>(
                        "15",
                        null,
                        new NodoBinario<>("25")
                )
        );
        System.out.println(root);
        NodoBinario root2 = new NodoBinario<String>(
                "Diego",
                new NodoBinario<>(
                        "Pedro",
                        new NodoBinario<>("Susan"),
                        new NodoBinario<>("Diana")
                ),
                new NodoBinario<>(
                    "Mario"
                )
        );
        System.out.println(root2);
    }
}