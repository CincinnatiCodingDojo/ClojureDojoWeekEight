(ns clojuredojoweekeight.core-test
  (:require [clojure.test :refer :all]
            [clojuredojoweekeight.core :refer :all]))

(def towers [[] [3 1] [2]])

(deftest test-get-pole
	(is (= [2] (get-pole towers 2)))
	(is (= [3 1] (get-pole towers 1))) 
)

(deftest test-move-disc
	(is (= (move-disc towers 2 0) [[2] [3 1] []]))
)