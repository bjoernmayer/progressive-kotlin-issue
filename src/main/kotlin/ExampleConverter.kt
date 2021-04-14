import org.springframework.core.convert.converter.Converter

class ExampleConverter<Source> : Converter<Source, String>{
    override fun convert(source: Source): String? {
        TODO("Not yet implemented")
    }
}