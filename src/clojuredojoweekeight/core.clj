(ns clojuredojoweekeight.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn get-pole [towers poleNum]
	(get towers poleNum)
)

(defn move-disc [towers fromPole toPole]
	(let [disc (peek (get towers fromPole))]
			(let 
				[newTowers (assoc towers fromPole (pop (get towers fromPole)))]
				(assoc newTowers toPole (conj (get towers toPole) disc)) 
			)
	)
)