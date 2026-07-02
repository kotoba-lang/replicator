(ns kotoba.replicator-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.replicator :as replicator]))

(deftest status-test
  (is (= "ADR-2605261800" (:adr replicator/status)))
  (is (= "R1.0-path-reservation" (:phase replicator/status)))
  (is (= "utsushimi" (:kami-name replicator/status)))
  (is (= "omni.replicator.core" (:nv-compat-target replicator/status))))

(deftest consts-match-status-test
  (is (= replicator/adr (:adr replicator/status)))
  (is (= replicator/phase (:phase replicator/status)))
  (is (= replicator/kami-name (:kami-name replicator/status)))
  (is (= replicator/nv-compat-target (:nv-compat-target replicator/status))))
