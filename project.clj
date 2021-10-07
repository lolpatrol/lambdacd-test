(defproject example-pipeline "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :dependencies [[lambdacd "0.14.7"]
                           [lambdaui "1.2.0" :exclusions [lambdacd]]
                           [http-kit "2.5.3"]
                           [org.clojure/clojure "1.9.0"]
                           [org.clojure/tools.logging "0.3.1"]
                           [org.slf4j/slf4j-api "1.7.5"]
                           [ch.qos.logback/logback-core "1.0.13"]
                           [ch.qos.logback/logback-classic "1.0.13"]
                           [lambdacd-git "0.4.1" :exclusions [lambdacd]]]
            :profiles {:uberjar {:aot :all}}
            :main example-pipeline.core)
