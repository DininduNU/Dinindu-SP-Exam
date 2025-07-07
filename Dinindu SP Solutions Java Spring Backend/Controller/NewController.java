@RestController
@RequestMapping("/news")
@CrossOrigin
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @PostMapping
    public News createNews(@RequestBody NewsRequest request) {
        News news = new News();
        news.setTitle(request.title);
        news.setContent(request.content);

        List<Category> categories = categoryRepository.findAllById(request.categoryIds);
        news.setCategories(categories);

        return newsRepository.save(news);
    }
}
