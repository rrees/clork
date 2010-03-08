
code_dirs = ["src"]
test_dirs = ["test"]

test_dirs << code_dirs

run_jars = Dir.new('lib').entries.select{|f| f =~ /.*.jar/}.map {|jar| File.join('lib', jar)}
#test_jars = Dir.new(File.join("lib", 'test')).entries.select

task :default => [:hello]

task :hello do
  puts "Hello world"
end

task :clork do
  run_clork = "java -cp #{code_dirs.join(':')}:#{run_jars.join(':')} jline.ConsoleRunner clojure.main"
  puts run_clork
  system(run_clork)
end

task :test do
	  run_clork = "java -cp #{test_dirs.join(':')}:#{run_jars.join(':')} jline.ConsoleRunner clojure.main test/clork-test.clj"
	  puts run_clork
	  system(run_clork)
end
