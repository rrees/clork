
code_dirs = ["src"]
test_dirs = ["test"]

test_dirs << code_dirs

task :default => [:hello]

task :hello do
  puts "Hello world"
end

task :clork do
  system("java -cp src:test:lib/clojure.jar:lib/jline-0.9.94.jar jline.ConsoleRunner clojure.main")
end

task :test