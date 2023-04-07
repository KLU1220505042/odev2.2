# odev2.2

Binary Tree Child Sum Özelliği
Bu Java kodu, bir düğümün alt düğümlerinin toplamının, düğümün değerine eşit olup olmadığını kontrol etmek için yöntemler içeren bir BinaryTre sınıfı tanımlar.

Kullanım
BinaryTre sınıfını kullanmak için, bir örneğini oluşturabilir ve Node sınıfını kullanarak ikili ağacın root düğümünü ayarlayabilirsiniz. Ardından, isChildSum yöntemi, kök düğümünün alt düğüm özelliğini sağlayıp sağlamadığını kontrol etmek için çağrılabilir.

Uygulama
BinaryTre sınıfı, ikili ağaçtaki bir düğümü temsil etmek için bir Node sınıfına sahiptir. childSum yöntemi, bir Node parametresi alan ve sol ve sağ çocuk düğümlerinin değerlerinin toplamını hesaplayan ve toplamı döndüren özyineli bir yardımcı yöntemdir. isChildSum yöntemi, bir Node parametresi alan ve sol ve sağ çocuk düğümlerinin değerlerinin toplamının kendisinin değerine eşit olup olmadığını kontrol eden özyineli bir yöntemdir. Eşitse true değerini döndürür, aksi takdirde false değerini döndürür.

Algoritmanın Kullanılma Amacı Ve Çalışma Sekli

Bu algoritma, verilen bir ikili ağacın kök düğümünün alt düğümlerinin toplamına eşit olup olmadığını kontrol eder.
Algoritma, ikili ağacın her düğümünü ziyaret eder ve her düğümün alt düğümlerinin toplamını hesaplar. Daha sonra, hesaplanan toplamları kullanarak, kök düğümünün alt düğümlerinin toplamına eşit olup olmadığını kontrol eder.
Algoritma, bir ikili ağaçtaki düğümleri ziyaret etmek için özyinelemeli bir işlem kullanır. Her düğüm ziyaret edildiğinde, sol ve sağ alt ağaçların toplamı hesaplanır ve daha sonra düğümün kendisi de toplama dahil edilir. İkili ağacın en alt düzeyine ulaşıldığında, boş bir alt ağaç toplamı olarak 0 değeri döndürülür.
Son olarak, algoritma, kök düğümünün alt düğümlerinin toplamı ile kök düğümünün değerini karşılaştırır ve sonucu doğru veya yanlış olarak döndürür. Eğer kök düğümünün alt düğümlerinin toplamı kök düğümünün değerine eşitse, algoritma sonucu "true" olarak döndürür ve aksi takdirde "false" olarak döndürür.
Bu algoritma, ikili ağaçların alt düğümlerinin toplamı hakkında temel bir anlayış sağlamak için kullanılabilir. Ayrıca, yazılım mühendisliği projelerinde, veri yapıları derslerinde ve iş mülakatlarında sıklıkla kullanılan bir sorunun çözümü için de kullanılabilir.
