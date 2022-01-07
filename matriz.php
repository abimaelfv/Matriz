<?php

$m = 3; // fila
$n = 4; // columna

$data = array();

// leer datos aleatorios
for ($i=0; $i < $m; $i++) { 
    for ($j=0; $j < $n; $j++) {
        $data[$i][$j] = rand(0,9);
    }
}

// mostrar matriz
for ($i=0; $i < $m; $i++) { 
    echo "| ";
    for ($j=0; $j < $n; $j++) { 
        echo $data[$i][$j].' ';
    }
    echo '| <br>';
}

?>

