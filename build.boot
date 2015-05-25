(set-env!
  :source-paths #{"src"}
  :dependencies '[[org.clojure/clojure       "1.6.0"    :scope "provided"]
                  [boot/core                 "2.0.0"    :scope "provided"]
                  [adzerk/bootlaces          "0.1.9"    :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.1.10-SNAPSHOT")

(bootlaces! +version+)

(task-options!
  pom  {:project     'modnakasta/boot-cljs-repl
        :version     +version+
        :description "Boot task to compile ClojureScript applications."
        :url         "https://github.com/modnakasta/boot-cljs-repl"
        :scm         {:url "https://github.com/modnakasta/boot-cljs-repl"}
        :license     {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})
