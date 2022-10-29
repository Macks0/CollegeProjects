import hikari
import lightbulb

bot = lightbulb.BotApp(
    token='MTAzNDk1OTEzOTgwNzQ0MDk2Nw.G45T-7.svJf0ls4vui_tIl5iE_AbCWq7bWddw6L1n6-cM',
    default_enabled_guilds=(931377710649970698)
)


@bot.listen(hikari.StartedEvent)
async def bot_startup(event):
    print('FatBoy is here!')


@bot.command
@lightbulb.command('ping', 'Says pong!')
@lightbulb.implements(lightbulb.SlashCommand)
async def ping(ctx):
    await ctx.respond('Pong!')


@bot.command
@lightbulb.command('group', 'This is a group')
@lightbulb.implements(lightbulb.SlashCommandGroup)
async def my_group(ctx):
    pass


@my_group.child
@lightbulb.command('subcommand', 'This is a subcommand')
@lightbulb.implements(lightbulb.SlashSubCommand)
async def subcommand(ctx):
    await ctx.respond('I am a subcommand!')

@bot.command
@lightbulb.option('num1', 'The First number', type=int)
@lightbulb.command('add', 'Add two numbers together')
async def add(ctx):


bot.run()
